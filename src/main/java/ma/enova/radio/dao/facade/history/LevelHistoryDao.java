package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.LevelHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelHistoryDao extends AbstractHistoryRepository<LevelHistory, Long> {

}
