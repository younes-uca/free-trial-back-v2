package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.FreeTrialDetailHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialDetailHistoryDao extends AbstractHistoryRepository<FreeTrialDetailHistory, Long> {

}
