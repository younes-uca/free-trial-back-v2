package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherDao extends AbstractRepository<Teacher, Long> {
    Teacher findByCode(String code);

    int deleteByCode(String code);


}
