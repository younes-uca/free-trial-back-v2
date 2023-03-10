package ma.enova.radio.zynerator.service;

import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import ma.enova.radio.zynerator.history.HistCriteria;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
        super(dao, historyRepository);
    }

}