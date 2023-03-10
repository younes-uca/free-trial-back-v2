package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialTeacherEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateHistory> {

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
