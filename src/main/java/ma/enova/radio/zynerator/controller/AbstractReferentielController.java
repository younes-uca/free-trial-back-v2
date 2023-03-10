package ma.enova.radio.zynerator.controller;

import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.enova.radio.zynerator.converter.AbstractReferentielConverter;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import ma.enova.radio.zynerator.dto.ReferentielBaseDto;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import ma.enova.radio.zynerator.service.IService;

public class AbstractReferentielController<T extends AuditBusinessObjectEnhanced, DTO extends ReferentielBaseDto, H extends HistBusinessObject, Criteria extends BaseCriteria, HistoryCriteria extends BaseCriteria, SERV extends IService<T, Criteria, HistoryCriteria>, CONV extends AbstractReferentielConverter<T, DTO, H>> extends AbstractController<T, DTO, H, Criteria, HistoryCriteria, SERV, CONV> {


    public AbstractReferentielController(SERV service, CONV converter) {
        super(service, converter);
    }

}
