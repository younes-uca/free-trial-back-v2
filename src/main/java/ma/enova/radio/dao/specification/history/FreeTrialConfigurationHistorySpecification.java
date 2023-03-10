package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.FreeTrialConfigurationHistory;
import ma.enova.radio.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialConfigurationHistorySpecification extends AbstractHistorySpecification<FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationHistory> {

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
