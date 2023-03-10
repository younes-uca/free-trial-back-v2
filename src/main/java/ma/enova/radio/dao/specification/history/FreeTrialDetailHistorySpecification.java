package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialDetailHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialDetailHistorySpecification extends AbstractHistorySpecification<FreeTrialDetailHistoryCriteria, FreeTrialDetailHistory> {

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
