package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialTeacherEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialTeacherEmailTemplateHistory, Long> {

}
