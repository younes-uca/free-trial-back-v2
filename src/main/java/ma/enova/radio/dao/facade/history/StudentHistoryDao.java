package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.StudentHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentHistoryDao extends AbstractHistoryRepository<StudentHistory, Long> {

}
