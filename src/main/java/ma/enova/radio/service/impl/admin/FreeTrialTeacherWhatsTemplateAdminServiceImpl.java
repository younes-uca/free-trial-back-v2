package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.enova.radio.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialTeacherWhatsTemplateDao;
import ma.enova.radio.dao.facade.history.FreeTrialTeacherWhatsTemplateHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialTeacherWhatsTemplateSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FreeTrialTeacherWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherWhatsTemplate, FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateDao,
        FreeTrialTeacherWhatsTemplateHistoryDao> implements FreeTrialTeacherWhatsTemplateAdminService {


    public void findOrSaveAssociatedObject(FreeTrialTeacherWhatsTemplate t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(FreeTrialTeacherWhatsTemplate.class, FreeTrialTeacherWhatsTemplateHistory.class, FreeTrialTeacherWhatsTemplateHistoryCriteria.class, FreeTrialTeacherWhatsTemplateSpecification.class);
    }

    public FreeTrialTeacherWhatsTemplateAdminServiceImpl(FreeTrialTeacherWhatsTemplateDao dao, FreeTrialTeacherWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}