package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.Student;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao extends AbstractRepository<Student, Long> {
    Student findByCode(String code);

    int deleteByCode(String code);


}
