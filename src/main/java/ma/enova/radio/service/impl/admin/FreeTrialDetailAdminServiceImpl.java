package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.bean.history.FreeTrialDetailHistory;
import ma.enova.radio.dao.criteria.core.FreeTrialDetailCriteria;
import ma.enova.radio.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.enova.radio.dao.facade.core.FreeTrialDetailDao;
import ma.enova.radio.dao.facade.history.FreeTrialDetailHistoryDao;
import ma.enova.radio.dao.specification.core.FreeTrialDetailSpecification;
import ma.enova.radio.service.facade.admin.FreeTrialAdminService;
import ma.enova.radio.service.facade.admin.FreeTrialDetailAdminService;
import ma.enova.radio.service.facade.admin.StudentAdminService;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeTrialDetailAdminServiceImpl extends AbstractServiceImpl<FreeTrialDetail, FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailDao,
        FreeTrialDetailHistoryDao> implements FreeTrialDetailAdminService {


    @Override
    public FreeTrialDetail sauvegarder(FreeTrialDetail freeTrialDetail) {
        FreeTrialDetail result = null;
        FreeTrialDetail foundedFreeTrialDetail = findByReference(freeTrialDetail.getReference());
        if (foundedFreeTrialDetail == null) {
            FreeTrial foundedFreeTrial = freeTrialDetail.getFreeTrial();
            freeTrialDetail.getFreeTrial().setNombreStudentTotal(foundedFreeTrial.getNombreStudentTotal() + 1);
            FreeTrialDetail savedFreeTrialDetail = dao.save(freeTrialDetail);

            result = savedFreeTrialDetail;
        }

        return result;
    }

    public void findOrSaveAssociatedObject(FreeTrialDetail t) {
        if (t != null) {
            t.setFreeTrial(freeTrialService.findOrSave(t.getFreeTrial()));
            t.setStudent(studentService.findOrSave(t.getStudent()));
        }
    }

    public List<FreeTrialDetail> findByFreeTrialId(Long id) {
        return dao.findByFreeTrialId(id);
    }

    public int deleteByFreeTrialId(Long id) {
        return dao.deleteByFreeTrialId(id);
    }

    public List<FreeTrialDetail> findByStudentId(Long id) {
        return dao.findByStudentId(id);
    }

    public int deleteByStudentId(Long id) {
        return dao.deleteByStudentId(id);
    }

    public void configure() {
        super.configure(FreeTrialDetail.class, FreeTrialDetailHistory.class, FreeTrialDetailHistoryCriteria.class, FreeTrialDetailSpecification.class);
    }

    @Autowired
    private StudentAdminService studentService;
    @Autowired
    private FreeTrialAdminService freeTrialService;

    public FreeTrialDetailAdminServiceImpl(FreeTrialDetailDao dao, FreeTrialDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

    public FreeTrialDetail findByReference(String reference) {
        return dao.findByReference(reference);
    }
}