package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.Level;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LevelDao extends AbstractRepository<Level, Long> {
    Level findByCode(String code);

    int deleteByCode(String code);


}
