package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Student;
import ma.enova.radio.bean.history.StudentHistory;
import ma.enova.radio.dao.criteria.core.StudentCriteria;
import ma.enova.radio.dao.criteria.history.StudentHistoryCriteria;
import ma.enova.radio.dao.facade.core.StudentDao;
import ma.enova.radio.dao.facade.history.StudentHistoryDao;
import ma.enova.radio.dao.specification.core.StudentSpecification;
import ma.enova.radio.service.facade.admin.StudentAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentAdminServiceImpl extends AbstractServiceImpl<Student, StudentHistory, StudentCriteria, StudentHistoryCriteria, StudentDao,
        StudentHistoryDao> implements StudentAdminService {


    public Student findByReferenceEntity(Student t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(Student t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(Student.class, StudentHistory.class, StudentHistoryCriteria.class, StudentSpecification.class);
    }

    public StudentAdminServiceImpl(StudentDao dao, StudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}