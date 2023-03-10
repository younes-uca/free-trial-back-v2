package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.StatutFreeTrial;
import ma.enova.radio.dao.criteria.core.StatutFreeTrialCriteria;
import ma.enova.radio.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;


public interface StatutFreeTrialAdminService extends IService<StatutFreeTrial, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria> {


    StatutFreeTrial findByCode(String code);
}
