package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.Services;
import ma.enova.radio.dao.criteria.core.ServicesCriteria;
import ma.enova.radio.dao.criteria.history.ServicesHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;


public interface ServicesAdminService extends IService<Services, ServicesCriteria, ServicesHistoryCriteria> {

    Long getNextOrdre();


}
