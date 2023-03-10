package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialStudentWhatsTemplate;
import ma.enova.radio.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialStudentWhatsTemplateSpecification extends AbstractSpecification<FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplate> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(), criteria.getObjectLike());
        addPredicate("source", criteria.getSource(), criteria.getSourceLike());
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
