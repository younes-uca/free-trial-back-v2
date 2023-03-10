package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.FreeTrialConfiguration;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FreeTrialConfigurationDao extends AbstractRepository<FreeTrialConfiguration, Long> {


}
