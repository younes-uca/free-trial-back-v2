package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.bean.history.FreeTrialHistory;
import ma.enova.radio.constant.StatutFreeTrialConstant;
import ma.enova.radio.dao.criteria.core.FreeTrialCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialDao;
import ma.enova.radio.dao.facade.history.FreeTrialHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialSpecification;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.service.util.EmailSenderAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import ma.enova.radio.zynerator.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FreeTrialAdminServiceImpl extends AbstractServiceImpl<FreeTrial, FreeTrialHistory, FreeTrialCriteria, FreeTrialHistoryCriteria, FreeTrialDao, FreeTrialHistoryDao> implements FreeTrialAdminService {


    //    @Scheduled(cron = "0 0 * * * *") // Runs every hour
//    @Scheduled(cron = "0 */5 * ? * *") // Runs every 5 minute
//    @Scheduled(cron = "0 * * ? * *") // Runs every minute
    public void sendFistReminderEmails() throws MessagingException {
        List<FreeTrial> freeTrials = dao.findAppropriateFreeTrialsByCode(StatutFreeTrialConstant.INITIALISATION_CODE + "," + StatutFreeTrialConstant.FIRST_EMAIL_SENT_RETRY_CODE);
        if (!freeTrials.isEmpty()) {
            for (FreeTrial myFreeTrial : freeTrials) {
                handelFreeTrialStudentEmails(myFreeTrial);
                emailSenderAdminService.sendEmail(myFreeTrial);
//        twilioWhatsAppSenderAdminService.sendWhatsAppMessage(myFreeTrial.getTeacher().getPhone(), myFreeTrial.getFreeTrialTeacherWhatsTemplate().getCorps());
                handlFreeTrialStatut(myFreeTrial);
            }
        }
    }

    private void handlFreeTrialStatut(FreeTrial myFreeTrial) {
        if (myFreeTrial.getFreeTrialDetails() != null) {
            int cmp = 0;
            for (FreeTrialDetail freeTrialDetail : myFreeTrial.getFreeTrialDetails()) {
                if (Boolean.TRUE.equals(freeTrialDetail.getEmailMessageSent())) cmp++;
            }
            if (cmp == myFreeTrial.getFreeTrialDetails().size()) {
                myFreeTrial.setStatutFreeTrial(statutFreeTrialService.findByCode(StatutFreeTrialConstant.FIRST_EMAIL_SENT_CODE));
                myFreeTrial.setDateFreeTrialPremierRappel(DateUtil.today);
            } else {
                myFreeTrial.setStatutFreeTrial(statutFreeTrialService.findByCode(StatutFreeTrialConstant.FIRST_EMAIL_SENT_RETRY_CODE));
                myFreeTrial.setDateFreeTrialPremierRappel(null);
            }
        }
        dao.save(myFreeTrial);
    }

    private void handelFreeTrialStudentEmails(FreeTrial myFreeTrial) throws MessagingException {
        List<FreeTrialDetail> freeTrialDetails = freeTrialDetailService.findByFreeTrialId(myFreeTrial.getId());
        for (FreeTrialDetail myFreeTrialDetail : freeTrialDetails) {
            if (myFreeTrialDetail.getEmailMessageSent() == false) {
//            LocalDateTime oneDayBeforeFreeTrialDate = myFreeTrialDetail.getFreeTrial().getDateFreeTrial().minusDays(1);
//            if (DateUtil.compareByYearMonthAndDay(oneDayBeforeFreeTrialDate)) {
                emailSenderAdminService.sendEmail(myFreeTrialDetail);
                freeTrialDetailService.save(myFreeTrialDetail);
//              twilioWhatsAppSenderAdminService.sendWhatsAppMessage(myFreeTrialDetail.getStudent().getPhone(), myFreeTrial.getFreeTrialStudentWhatsTemplate().getCorps());
//            }
            }
        }
    }


    @Override
    public List<FreeTrial> findAppropriateFreeTrial() {
        return dao.findAppropriateFreeTrialsByCode(StatutFreeTrialConstant.INITIALISATION_CODE);
    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public FreeTrial create(FreeTrial t) {
        super.create(t);
        if (t.getFreeTrialDetails() != null) {
            t.getFreeTrialDetails().forEach(element -> {
                element.setFreeTrial(t);
                freeTrialDetailService.create(element);
            });
        }
        return t;
    }

    public FreeTrial findWithAssociatedLists(Long id) {
        FreeTrial result = dao.findById(id).orElse(null);
        if (result != null && result.getId() != null) {
            result.setFreeTrialDetails(freeTrialDetailService.findByFreeTrialId(id));
        }
        return result;
    }

    @Transactional
    public void delete(List<FreeTrial> list) {
        if (list != null) {
            for (FreeTrial element : list) {
                //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TODO
                freeTrialDetailService.deleteByFreeTrialId(element.getId());
                dao.deleteById(element.getId());
            }
        }
    }

    public void updateWithAssociatedLists(FreeTrial freeTrial) {
        if (freeTrial != null && freeTrial.getId() != null) {
            //List<List<FreeTrialDetail>> resultFreeTrialDetails= freeTrialDetailService.getToBeSavedAndToBeDeleted(freeTrialDetailService.findByFreeTrialId(freeTrial.getId()),freeTrial.getFreeTrialDetails());
            //freeTrialDetailService.delete(resultFreeTrialDetails.get(1));
            //associateFreeTrialDetail(freeTrial,resultFreeTrialDetails.get(0));
            //freeTrialDetailService.update(resultFreeTrialDetails.get(0));
        }
    }

    public void findOrSaveAssociatedObject(FreeTrial t) {
        if (t != null) {
            t.setTeacher(teacherService.findOrSave(t.getTeacher()));
            t.setLevel(levelService.findOrSave(t.getLevel()));
            t.setFreeTrialStudentWhatsTemplate(freeTrialStudentWhatsTemplateService.findOrSave(t.getFreeTrialStudentWhatsTemplate()));
            t.setFreeTrialStudentEmailTemplate(freeTrialStudentEmailTemplateService.findOrSave(t.getFreeTrialStudentEmailTemplate()));
            t.setFreeTrialTeacherEmailTemplate(freeTrialTeacherEmailTemplateService.findOrSave(t.getFreeTrialTeacherEmailTemplate()));
            t.setFreeTrialTeacherWhatsTemplate(freeTrialTeacherWhatsTemplateService.findOrSave(t.getFreeTrialTeacherWhatsTemplate()));
            t.setFreeTrialConfiguration(freeTrialConfigurationService.findOrSave(t.getFreeTrialConfiguration()));
            t.setStatutFreeTrial(statutFreeTrialService.findOrSave(t.getStatutFreeTrial()));
        }
    }

    public List<FreeTrial> findByTeacherId(Long id) {
        return dao.findByTeacherId(id);
    }

    public int deleteByTeacherId(Long id) {
        return dao.deleteByTeacherId(id);
    }

    public List<FreeTrial> findByLevelId(Long id) {
        return dao.findByLevelId(id);
    }

    public int deleteByLevelId(Long id) {
        return dao.deleteByLevelId(id);
    }

    public List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(Long id) {
        return dao.findByFreeTrialStudentWhatsTemplateId(id);
    }

    public int deleteByFreeTrialStudentWhatsTemplateId(Long id) {
        return dao.deleteByFreeTrialStudentWhatsTemplateId(id);
    }

    public List<FreeTrial> findByFreeTrialStudentEmailTemplateId(Long id) {
        return dao.findByFreeTrialStudentEmailTemplateId(id);
    }

    public int deleteByFreeTrialStudentEmailTemplateId(Long id) {
        return dao.deleteByFreeTrialStudentEmailTemplateId(id);
    }

    public List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(Long id) {
        return dao.findByFreeTrialTeacherEmailTemplateId(id);
    }

    public int deleteByFreeTrialTeacherEmailTemplateId(Long id) {
        return dao.deleteByFreeTrialTeacherEmailTemplateId(id);
    }

    public List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(Long id) {
        return dao.findByFreeTrialTeacherWhatsTemplateId(id);
    }

    public int deleteByFreeTrialTeacherWhatsTemplateId(Long id) {
        return dao.deleteByFreeTrialTeacherWhatsTemplateId(id);
    }

    public List<FreeTrial> findByFreeTrialConfigurationId(Long id) {
        return dao.findByFreeTrialConfigurationId(id);
    }

    public int deleteByFreeTrialConfigurationId(Long id) {
        return dao.deleteByFreeTrialConfigurationId(id);
    }

    public List<FreeTrial> findByStatutFreeTrialId(Long id) {
        return dao.findByStatutFreeTrialId(id);
    }

    public int deleteByStatutFreeTrialId(Long id) {
        return dao.deleteByStatutFreeTrialId(id);
    }

    public void configure() {
        super.configure(FreeTrial.class, FreeTrialHistory.class, FreeTrialHistoryCriteria.class, FreeTrialSpecification.class);
    }

    @Override
    public FreeTrial save(FreeTrial freeTrial) {
        return dao.save(freeTrial);
    }

    @Override
    public FreeTrial findByDateFreeTrial(LocalDateTime date) {
        return dao.findByDateFreeTrial(date);
    }

    @Override
    public FreeTrial findByReference(String reference) {
        return dao.findByReference(reference);
    }

    @Autowired
    private TeacherAdminService teacherService;
    @Autowired
    private FreeTrialTeacherEmailTemplateAdminService freeTrialTeacherEmailTemplateService;
    @Autowired
    private StatutFreeTrialAdminService statutFreeTrialService;
    @Autowired
    private FreeTrialStudentEmailTemplateAdminService freeTrialStudentEmailTemplateService;
    @Autowired
    private FreeTrialTeacherWhatsTemplateAdminService freeTrialTeacherWhatsTemplateService;
    @Autowired
    private FreeTrialConfigurationAdminService freeTrialConfigurationService;
    @Autowired
    private LevelAdminService levelService;
    @Autowired
    private FreeTrialStudentWhatsTemplateAdminService freeTrialStudentWhatsTemplateService;
    @Autowired
    private FreeTrialDetailAdminService freeTrialDetailService;
    @Autowired
    private EmailSenderAdminService emailSenderAdminService;
    @Autowired
    private TwilioWhatsAppSenderAdminService twilioWhatsAppSenderAdminService;

    public FreeTrialAdminServiceImpl(FreeTrialDao dao, FreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

//    @Scheduled(cron = "0 0 * * * *") // Runs every hour
//    public void sendSecondReminderEmails() {
//        List<FreeTrial> freeTrials = dao.findAll();
//        if (!freeTrials.isEmpty()) {
//            for (FreeTrial myFreeTrial : freeTrials) {
//                if (!myFreeTrial.getStatutFreeTrial().getCode().equals("closed")) {
//                    for (FreeTrialDetail myFreeTrialDetail : myFreeTrial.getFreeTrialDetails()) {
//                        if (Boolean.FALSE.equals(myFreeTrialDetail.getEmailMessageSent())) {
//                            LocalDateTime oneHourBeforeFreeTrialDate = LocalDateTime.of(LocalDate.from(myFreeTrial.getDateFreeTrial()), LocalTime.MIN).minusHours(1);
//                            if (DateUtil.today.equals(oneHourBeforeFreeTrialDate)) {
//                                sendEmailsForStudent(myFreeTrialDetail);
//                            }
//                        }
//                        sendEmailsForTeacher(myFreeTrialDetail);
//                        myFreeTrial.setStatutFreeTrial(statutFreeTrialService.findByCode("second-email-sent"));
//                        myFreeTrial.setDateFreeTrialDeuxiemeRappel(DateUtil.today);
//                        dao.save(myFreeTrial);
//                    }
//
//                }
//            }
//        }
//
//    }

}