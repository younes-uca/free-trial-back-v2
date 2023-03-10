package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.bean.history.TeacherHistory;
import ma.enova.radio.dao.criteria.core.TeacherCriteria;
import ma.enova.radio.dao.criteria.history.TeacherHistoryCriteria;
import ma.enova.radio.dao.facade.core.TeacherDao;
import ma.enova.radio.dao.facade.history.TeacherHistoryDao;
import ma.enova.radio.dao.specification.core.TeacherSpecification;
import ma.enova.radio.service.facade.admin.TeacherAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TeacherAdminServiceImpl extends AbstractServiceImpl<Teacher, TeacherHistory, TeacherCriteria, TeacherHistoryCriteria, TeacherDao,
        TeacherHistoryDao> implements TeacherAdminService {


    public Teacher findByReferenceEntity(Teacher t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(Teacher t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(Teacher.class, TeacherHistory.class, TeacherHistoryCriteria.class, TeacherSpecification.class);
    }

    public TeacherAdminServiceImpl(TeacherDao dao, TeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}