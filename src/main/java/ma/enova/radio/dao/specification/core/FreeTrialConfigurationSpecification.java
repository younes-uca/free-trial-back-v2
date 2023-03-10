package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialConfiguration;
import ma.enova.radio.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialConfigurationSpecification extends AbstractSpecification<FreeTrialConfigurationCriteria, FreeTrialConfiguration> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateApplicationDebut", criteria.getDateApplicationDebut(), criteria.getDateApplicationDebutFrom(), criteria.getDateApplicationDebutTo());
        addPredicate("dateApplicationFin", criteria.getDateApplicationFin(), criteria.getDateApplicationFinFrom(), criteria.getDateApplicationFinTo());
        addPredicateInt("nombreStudentMax", criteria.getNombreStudentMax(), criteria.getNombreStudentMaxMin(), criteria.getNombreStudentMaxMax());
        addPredicateInt("nombreStudentMin", criteria.getNombreStudentMin(), criteria.getNombreStudentMinMin(), criteria.getNombreStudentMinMax());
    }

    public FreeTrialConfigurationSpecification(FreeTrialConfigurationCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationSpecification(FreeTrialConfigurationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
