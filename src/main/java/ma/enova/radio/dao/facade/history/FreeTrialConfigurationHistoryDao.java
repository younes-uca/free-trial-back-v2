package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.FreeTrialConfigurationHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialConfigurationHistoryDao extends AbstractHistoryRepository<FreeTrialConfigurationHistory, Long> {

}
