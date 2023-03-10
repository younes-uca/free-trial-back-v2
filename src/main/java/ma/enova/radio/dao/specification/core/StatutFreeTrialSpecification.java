package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.StatutFreeTrial;
import ma.enova.radio.dao.criteria.core.StatutFreeTrialCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class StatutFreeTrialSpecification extends AbstractSpecification<StatutFreeTrialCriteria, StatutFreeTrial> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(), criteria.getStyleLike());
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
