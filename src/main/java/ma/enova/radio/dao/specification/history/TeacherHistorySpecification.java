package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.TeacherHistory;
import ma.enova.radio.dao.criteria.history.TeacherHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class TeacherHistorySpecification extends AbstractHistorySpecification<TeacherHistoryCriteria, TeacherHistory> {

    public TeacherHistorySpecification(TeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public TeacherHistorySpecification(TeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
