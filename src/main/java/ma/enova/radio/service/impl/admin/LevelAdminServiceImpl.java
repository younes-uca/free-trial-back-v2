package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Level;
import ma.enova.radio.bean.history.LevelHistory;
import ma.enova.radio.dao.criteria.core.LevelCriteria;
import ma.enova.radio.dao.criteria.history.LevelHistoryCriteria;
import ma.enova.radio.dao.facade.core.LevelDao;
import ma.enova.radio.dao.facade.history.LevelHistoryDao;
import ma.enova.radio.dao.specification.core.LevelSpecification;
import ma.enova.radio.service.facade.admin.LevelAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class LevelAdminServiceImpl extends AbstractServiceImpl<Level, LevelHistory, LevelCriteria, LevelHistoryCriteria, LevelDao,
        LevelHistoryDao> implements LevelAdminService {


    public Level findByReferenceEntity(Level t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(Level t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(Level.class, LevelHistory.class, LevelHistoryCriteria.class, LevelSpecification.class);
    }

    public LevelAdminServiceImpl(LevelDao dao, LevelHistoryDao historyDao) {
        super(dao, historyDao);
    }

}