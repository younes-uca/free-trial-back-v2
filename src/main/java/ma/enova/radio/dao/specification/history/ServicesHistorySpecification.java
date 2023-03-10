package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.ServicesHistory;
import ma.enova.radio.dao.criteria.history.ServicesHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class ServicesHistorySpecification extends AbstractHistorySpecification<ServicesHistoryCriteria, ServicesHistory> {

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria) {
        super(criteria);
    }

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
