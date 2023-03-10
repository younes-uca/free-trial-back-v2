package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.Student;
import ma.enova.radio.dao.criteria.core.StudentCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class StudentSpecification extends AbstractSpecification<StudentCriteria, Student> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
        addPredicate("email", criteria.getEmail(), criteria.getEmailLike());
        addPredicate("phone", criteria.getPhone(), criteria.getPhoneLike());
    }

    public StudentSpecification(StudentCriteria criteria) {
        super(criteria);
    }

    public StudentSpecification(StudentCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
