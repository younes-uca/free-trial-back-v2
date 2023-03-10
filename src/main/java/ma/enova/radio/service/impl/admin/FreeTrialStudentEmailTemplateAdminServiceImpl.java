package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrialStudentEmailTemplate;
import ma.enova.radio.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialStudentEmailTemplateDao;
import ma.enova.radio.dao.facade.history.FreeTrialStudentEmailTemplateHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialStudentEmailTemplateSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FreeTrialStudentEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentEmailTemplate, FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateDao,
        FreeTrialStudentEmailTemplateHistoryDao> implements FreeTrialStudentEmailTemplateAdminService {


    public void findOrSaveAssociatedObject(FreeTrialStudentEmailTemplate t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(FreeTrialStudentEmailTemplate.class, FreeTrialStudentEmailTemplateHistory.class, FreeTrialStudentEmailTemplateHistoryCriteria.class, FreeTrialStudentEmailTemplateSpecification.class);
    }

    public FreeTrialStudentEmailTemplateAdminServiceImpl(FreeTrialStudentEmailTemplateDao dao, FreeTrialStudentEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}