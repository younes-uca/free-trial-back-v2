package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialTeacherWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateHistory> {

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
