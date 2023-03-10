package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FreeTrialDetailDao extends AbstractRepository<FreeTrialDetail, Long> {

    List<FreeTrialDetail> findByFreeTrialId(Long id);

    FreeTrialDetail findByReference(String reference);

    int deleteByFreeTrialId(Long id);

    List<FreeTrialDetail> findByStudentId(Long id);

    int deleteByStudentId(Long id);


}
