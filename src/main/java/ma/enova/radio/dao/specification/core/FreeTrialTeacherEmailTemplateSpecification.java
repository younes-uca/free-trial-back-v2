package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialTeacherEmailTemplate;
import ma.enova.radio.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialTeacherEmailTemplateSpecification extends AbstractSpecification<FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplate> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(), criteria.getObjectLike());
        addPredicate("source", criteria.getSource(), criteria.getSourceLike());
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
