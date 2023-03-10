package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.dao.criteria.core.TeacherCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class TeacherSpecification extends AbstractSpecification<TeacherCriteria, Teacher> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
        addPredicate("email", criteria.getEmail(), criteria.getEmailLike());
        addPredicate("phone", criteria.getPhone(), criteria.getPhoneLike());
    }

    public TeacherSpecification(TeacherCriteria criteria) {
        super(criteria);
    }

    public TeacherSpecification(TeacherCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
