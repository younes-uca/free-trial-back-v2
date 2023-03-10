package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialStudentEmailTemplate;
import ma.enova.radio.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialStudentEmailTemplateSpecification extends AbstractSpecification<FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplate> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(), criteria.getObjectLike());
        addPredicate("source", criteria.getSource(), criteria.getSourceLike());
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
