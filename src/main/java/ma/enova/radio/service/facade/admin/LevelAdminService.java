package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.Level;
import ma.enova.radio.dao.criteria.core.LevelCriteria;
import ma.enova.radio.dao.criteria.history.LevelHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;


public interface LevelAdminService extends IService<Level, LevelCriteria, LevelHistoryCriteria> {


}
