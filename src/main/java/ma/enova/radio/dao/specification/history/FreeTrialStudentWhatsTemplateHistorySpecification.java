package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialStudentWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateHistory> {

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
