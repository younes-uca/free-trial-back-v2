package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrialConfiguration;
import ma.enova.radio.bean.history.FreeTrialConfigurationHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialConfigurationDao;
import ma.enova.radio.dao.facade.history.FreeTrialConfigurationHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialConfigurationSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FreeTrialConfigurationAdminServiceImpl extends AbstractServiceImpl<FreeTrialConfiguration, FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationDao,
        FreeTrialConfigurationHistoryDao> implements FreeTrialConfigurationAdminService {


    public void findOrSaveAssociatedObject(FreeTrialConfiguration t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(FreeTrialConfiguration.class, FreeTrialConfigurationHistory.class, FreeTrialConfigurationHistoryCriteria.class, FreeTrialConfigurationSpecification.class);
    }

    public FreeTrialConfigurationAdminServiceImpl(FreeTrialConfigurationDao dao, FreeTrialConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}