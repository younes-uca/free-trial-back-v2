package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.StatutFreeTrial;
import ma.enova.radio.bean.history.StatutFreeTrialHistory;
import ma.enova.radio.dao.criteria.core.StatutFreeTrialCriteria;
import ma.enova.radio.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.enova.radio.dao.facade.core.StatutFreeTrialDao;
import ma.enova.radio.dao.facade.history.StatutFreeTrialHistoryDao;
import ma.enova.radio.dao.specification.core.StatutFreeTrialSpecification;
import ma.enova.radio.service.facade.admin.StatutFreeTrialAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StatutFreeTrialAdminServiceImpl extends AbstractServiceImpl<StatutFreeTrial, StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialDao,
        StatutFreeTrialHistoryDao> implements StatutFreeTrialAdminService {
    @Override
    public StatutFreeTrial findByCode(String code) {
        return dao.findByCode(code);
    }

    public StatutFreeTrial findByReferenceEntity(StatutFreeTrial t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(StatutFreeTrial t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(StatutFreeTrial.class, StatutFreeTrialHistory.class, StatutFreeTrialHistoryCriteria.class, StatutFreeTrialSpecification.class);
    }

    public StatutFreeTrialAdminServiceImpl(StatutFreeTrialDao dao, StatutFreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}