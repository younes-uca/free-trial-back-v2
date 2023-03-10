package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.dao.criteria.core.TeacherCriteria;
import ma.enova.radio.dao.criteria.history.TeacherHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;


public interface TeacherAdminService extends IService<Teacher, TeacherCriteria, TeacherHistoryCriteria> {


}
