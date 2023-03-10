package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.Services;
import ma.enova.radio.dao.criteria.core.ServicesCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class ServicesSpecification extends AbstractSpecification<ServicesCriteria, Services> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
    }

    public ServicesSpecification(ServicesCriteria criteria) {
        super(criteria);
    }

    public ServicesSpecification(ServicesCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
