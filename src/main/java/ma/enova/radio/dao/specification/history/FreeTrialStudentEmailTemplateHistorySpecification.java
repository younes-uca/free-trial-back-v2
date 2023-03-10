package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialStudentEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateHistory> {

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
