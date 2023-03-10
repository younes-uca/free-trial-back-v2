package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialHistorySpecification extends AbstractHistorySpecification<FreeTrialHistoryCriteria, FreeTrialHistory> {

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
