package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.StatutFreeTrialHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutFreeTrialHistoryDao extends AbstractHistoryRepository<StatutFreeTrialHistory, Long> {

}
