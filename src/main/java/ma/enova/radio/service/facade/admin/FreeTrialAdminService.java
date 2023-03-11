package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.dao.criteria.core.FreeTrialCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.enova.radio.zynerator.service.IService;

import java.time.LocalDateTime;
import java.util.List;


public interface FreeTrialAdminService extends IService<FreeTrial, FreeTrialCriteria, FreeTrialHistoryCriteria> {

    List<FreeTrial> findAppropriateFreeTrial();

    FreeTrial save(FreeTrial freeTrial);

    FreeTrial findByDateFreeTrial(LocalDateTime date);
    FreeTrial findByReference(String reference);
    List<FreeTrial> findByTeacherId(Long id);

    int deleteByTeacherId(Long id);

    List<FreeTrial> findByLevelId(Long id);

    int deleteByLevelId(Long id);

    List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(Long id);

    int deleteByFreeTrialStudentWhatsTemplateId(Long id);

    List<FreeTrial> findByFreeTrialStudentEmailTemplateId(Long id);

    int deleteByFreeTrialStudentEmailTemplateId(Long id);

    List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(Long id);

    int deleteByFreeTrialTeacherEmailTemplateId(Long id);

    List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(Long id);

    int deleteByFreeTrialTeacherWhatsTemplateId(Long id);

    List<FreeTrial> findByFreeTrialConfigurationId(Long id);

    int deleteByFreeTrialConfigurationId(Long id);

    List<FreeTrial> findByStatutFreeTrialId(Long id);

    int deleteByStatutFreeTrialId(Long id);


}
