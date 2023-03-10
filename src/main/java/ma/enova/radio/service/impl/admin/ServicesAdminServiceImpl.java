package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Services;
import ma.enova.radio.bean.history.ServicesHistory;
import ma.enova.radio.dao.criteria.core.ServicesCriteria;
import ma.enova.radio.dao.criteria.history.ServicesHistoryCriteria;
import ma.enova.radio.dao.facade.core.ServicesDao;
import ma.enova.radio.dao.facade.history.ServicesHistoryDao;
import ma.enova.radio.dao.specification.core.ServicesSpecification;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicesAdminServiceImpl extends AbstractServiceImpl<Services, ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesDao,
        ServicesHistoryDao> implements ServicesAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Services findByReferenceEntity(Services t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(Services t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(Services.class, ServicesHistory.class, ServicesHistoryCriteria.class, ServicesSpecification.class);
    }

    public ServicesAdminServiceImpl(ServicesDao dao, ServicesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}