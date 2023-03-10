package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.StatutFreeTrial;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatutFreeTrialDao extends AbstractRepository<StatutFreeTrial, Long> {
    StatutFreeTrial findByCode(String code);

    int deleteByCode(String code);


}
