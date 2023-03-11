package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.dao.criteria.core.FreeTrialDetailCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface FreeTrialDetailAdminService extends IService<FreeTrialDetail, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria> {

    FreeTrialDetail sauvegarder(FreeTrialDetail freeTrialDetail);

    List<FreeTrialDetail> findByFreeTrialId(Long id);

    int deleteByFreeTrialId(Long id);

    List<FreeTrialDetail> findByStudentId(Long id);

    int deleteByStudentId(Long id);


    FreeTrialDetail save(FreeTrialDetail freeTrialDetail);
}
