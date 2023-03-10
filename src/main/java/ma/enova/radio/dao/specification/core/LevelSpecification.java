package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.Level;
import ma.enova.radio.dao.criteria.core.LevelCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class LevelSpecification extends AbstractSpecification<LevelCriteria, Level> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
    }

    public LevelSpecification(LevelCriteria criteria) {
        super(criteria);
    }

    public LevelSpecification(LevelCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
