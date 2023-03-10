package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrialStudentWhatsTemplate;
import ma.enova.radio.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialStudentWhatsTemplateDao;
import ma.enova.radio.dao.facade.history.FreeTrialStudentWhatsTemplateHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialStudentWhatsTemplateSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FreeTrialStudentWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateDao,
        FreeTrialStudentWhatsTemplateHistoryDao> implements FreeTrialStudentWhatsTemplateAdminService {


    public void findOrSaveAssociatedObject(FreeTrialStudentWhatsTemplate t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(FreeTrialStudentWhatsTemplate.class, FreeTrialStudentWhatsTemplateHistory.class, FreeTrialStudentWhatsTemplateHistoryCriteria.class, FreeTrialStudentWhatsTemplateSpecification.class);
    }

    public FreeTrialStudentWhatsTemplateAdminServiceImpl(FreeTrialStudentWhatsTemplateDao dao, FreeTrialStudentWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}