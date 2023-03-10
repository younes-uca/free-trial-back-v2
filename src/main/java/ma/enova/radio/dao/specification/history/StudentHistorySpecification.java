package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.StudentHistory;
import ma.enova.radio.dao.criteria.history.StudentHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class StudentHistorySpecification extends AbstractHistorySpecification<StudentHistoryCriteria, StudentHistory> {

    public StudentHistorySpecification(StudentHistoryCriteria criteria) {
        super(criteria);
    }

    public StudentHistorySpecification(StudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
