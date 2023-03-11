package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface FreeTrialDao extends AbstractRepository<FreeTrial, Long> {


    @Query("SELECT item FROM FreeTrial item WHERE item.nombreStudentTotal < item.freeTrialConfiguration.nombreStudentMax AND item.statutFreeTrial.code in (:codes)")
    List<FreeTrial> findAppropriateFreeTrialsByCode(@PathParam("codes") String codes);

    List<FreeTrial> findByTeacherId(Long id);
    FreeTrial findByReference(String reference);


    FreeTrial findByDateFreeTrial(LocalDateTime date);

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
