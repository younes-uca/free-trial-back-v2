package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.StatutFreeTrialHistory;
import ma.enova.radio.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class StatutFreeTrialHistorySpecification extends AbstractHistorySpecification<StatutFreeTrialHistoryCriteria, StatutFreeTrialHistory> {

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
