package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.Student;
import ma.enova.radio.dao.criteria.core.StudentCriteria;
import ma.enova.radio.dao.criteria.history.StudentHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;


public interface StudentAdminService extends IService<Student, StudentCriteria, StudentHistoryCriteria> {


}
