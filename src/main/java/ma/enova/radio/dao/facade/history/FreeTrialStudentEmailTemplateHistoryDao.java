package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialStudentEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialStudentEmailTemplateHistory, Long> {

}
