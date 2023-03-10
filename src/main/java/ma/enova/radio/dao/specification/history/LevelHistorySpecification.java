package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.LevelHistory;
import ma.enova.radio.dao.criteria.history.LevelHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class LevelHistorySpecification extends AbstractHistorySpecification<LevelHistoryCriteria, LevelHistory> {

    public LevelHistorySpecification(LevelHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelHistorySpecification(LevelHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
