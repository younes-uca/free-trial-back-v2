package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrialTeacherEmailTemplate;
import ma.enova.radio.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialTeacherEmailTemplateDao;
import ma.enova.radio.dao.facade.history.FreeTrialTeacherEmailTemplateHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialTeacherEmailTemplateSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FreeTrialTeacherEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherEmailTemplate, FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateDao,
        FreeTrialTeacherEmailTemplateHistoryDao> implements FreeTrialTeacherEmailTemplateAdminService {


    public void findOrSaveAssociatedObject(FreeTrialTeacherEmailTemplate t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(FreeTrialTeacherEmailTemplate.class, FreeTrialTeacherEmailTemplateHistory.class, FreeTrialTeacherEmailTemplateHistoryCriteria.class, FreeTrialTeacherEmailTemplateSpecification.class);
    }

    public FreeTrialTeacherEmailTemplateAdminServiceImpl(FreeTrialTeacherEmailTemplateDao dao, FreeTrialTeacherEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}