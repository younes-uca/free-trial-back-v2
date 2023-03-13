package ma.enova.radio.process.impl;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.constant.StatutFreeTrialConstant;
import ma.enova.radio.dao.facade.core.FreeTrialDao;
import ma.enova.radio.process.facade.FreeTrialFirstMailHandlingAdminService;
import ma.enova.radio.service.facade.admin.FreeTrialDetailAdminService;
import ma.enova.radio.service.facade.admin.StatutFreeTrialAdminService;
import ma.enova.radio.service.util.EmailSenderAdminService;
import ma.enova.radio.zynerator.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.List;

@Service
public class FreeTrialFirstMailHandlingAdminServiceImpl implements FreeTrialFirstMailHandlingAdminService {

    //    @Scheduled(cron = "0 0 * * * *") // Runs every hour
//    @Scheduled(cron = "0 */5 * ? * *") // Runs every 5 minute
//    @Scheduled(cron = "0 * * ? * *") // Runs every minute
    public void sendFistReminderEmails() throws MessagingException {
        List<FreeTrial> freeTrials = dao.findAppropriateFreeTrialsByCode(new String[]{StatutFreeTrialConstant.INITIALISATION_CODE , StatutFreeTrialConstant.FIRST_EMAIL_SENT_RETRY_CODE});
        if (!freeTrials.isEmpty()) {
            for (FreeTrial myFreeTrial : freeTrials) {
                handelFreeTrialStudentEmails(myFreeTrial);
                handlFreeTrialTeacherEmail(myFreeTrial);
//        twilioWhatsAppSenderAdminService.sendWhatsAppMessage(myFreeTrial.getTeacher().getPhone(), myFreeTrial.getFreeTrialTeacherWhatsTemplate().getCorps());
                handlFreeTrialStatut(myFreeTrial);
            }
        }
    }

    private void handlFreeTrialTeacherEmail(FreeTrial myFreeTrial) throws MessagingException {
        if (Boolean.FALSE.equals(myFreeTrial.getEmailTeacherSent())) emailSenderAdminService.sendEmail(myFreeTrial);
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
        myFreeTrial.setFreeTrialDetails(freeTrialDetails);
        for (FreeTrialDetail myFreeTrialDetail : freeTrialDetails) {
            if (Boolean.FALSE.equals(myFreeTrialDetail.getEmailMessageSent())) {
//            LocalDateTime oneDayBeforeFreeTrialDate = myFreeTrialDetail.getFreeTrial().getDateFreeTrial().minusDays(1);
//            if (DateUtil.compareByYearMonthAndDay(oneDayBeforeFreeTrialDate)) {
                emailSenderAdminService.sendEmail(myFreeTrialDetail);
                freeTrialDetailService.save(myFreeTrialDetail);
//              twilioWhatsAppSenderAdminService.sendWhatsAppMessage(myFreeTrialDetail.getStudent().getPhone(), myFreeTrial.getFreeTrialStudentWhatsTemplate().getCorps());
//            }
            }
        }
    }

    @Autowired
    private StatutFreeTrialAdminService statutFreeTrialService;
    @Autowired
    private FreeTrialDetailAdminService freeTrialDetailService;
    @Autowired
    private EmailSenderAdminService emailSenderAdminService;
    @Autowired
    private FreeTrialDao dao;


}