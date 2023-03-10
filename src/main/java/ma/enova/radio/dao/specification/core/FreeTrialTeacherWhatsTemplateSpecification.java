package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.enova.radio.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialTeacherWhatsTemplateSpecification extends AbstractSpecification<FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplate> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(), criteria.getObjectLike());
        addPredicate("source", criteria.getSource(), criteria.getSourceLike());
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
