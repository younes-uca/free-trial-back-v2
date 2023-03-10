package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.dao.criteria.core.FreeTrialCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialSpecification extends AbstractSpecification<FreeTrialCriteria, FreeTrial> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("dateFreeTrial", criteria.getDateFreeTrial(), criteria.getDateFreeTrialFrom(), criteria.getDateFreeTrialTo());
        addPredicate("link", criteria.getLink(), criteria.getLinkLike());
        addPredicate("dateFreeTrialPremierRappel", criteria.getDateFreeTrialPremierRappel(), criteria.getDateFreeTrialPremierRappelFrom(), criteria.getDateFreeTrialPremierRappelTo());
        addPredicate("dateFreeTrialDeuxiemeRappel", criteria.getDateFreeTrialDeuxiemeRappel(), criteria.getDateFreeTrialDeuxiemeRappelFrom(), criteria.getDateFreeTrialDeuxiemeRappelTo());
        addPredicateInt("nombreStudentTotal", criteria.getNombreStudentTotal(), criteria.getNombreStudentTotalMin(), criteria.getNombreStudentTotalMax());
        addPredicateInt("nombreStudentAbonne", criteria.getNombreStudentAbonne(), criteria.getNombreStudentAbonneMin(), criteria.getNombreStudentAbonneMax());
        addPredicateInt("nombreStudentPresent", criteria.getNombreStudentPresent(), criteria.getNombreStudentPresentMin(), criteria.getNombreStudentPresentMax());
        addPredicateFk("teacher", "id", criteria.getTeacher() == null ? null : criteria.getTeacher().getId());
        addPredicateFk("teacher", "code", criteria.getTeacher() == null ? null : criteria.getTeacher().getCode());
        addPredicateFk("level", "id", criteria.getLevel() == null ? null : criteria.getLevel().getId());
        addPredicateFk("level", "code", criteria.getLevel() == null ? null : criteria.getLevel().getCode());
        addPredicateFk("freeTrialStudentWhatsTemplate", "id", criteria.getFreeTrialStudentWhatsTemplate() == null ? null : criteria.getFreeTrialStudentWhatsTemplate().getId());
        addPredicateFk("freeTrialStudentEmailTemplate", "id", criteria.getFreeTrialStudentEmailTemplate() == null ? null : criteria.getFreeTrialStudentEmailTemplate().getId());
        addPredicateFk("freeTrialTeacherEmailTemplate", "id", criteria.getFreeTrialTeacherEmailTemplate() == null ? null : criteria.getFreeTrialTeacherEmailTemplate().getId());
        addPredicateFk("freeTrialTeacherWhatsTemplate", "id", criteria.getFreeTrialTeacherWhatsTemplate() == null ? null : criteria.getFreeTrialTeacherWhatsTemplate().getId());
        addPredicateFk("freeTrialConfiguration", "id", criteria.getFreeTrialConfiguration() == null ? null : criteria.getFreeTrialConfiguration().getId());
        addPredicateFk("statutFreeTrial", "id", criteria.getStatutFreeTrial() == null ? null : criteria.getStatutFreeTrial().getId());
        addPredicateFk("statutFreeTrial", "code", criteria.getStatutFreeTrial() == null ? null : criteria.getStatutFreeTrial().getCode());
    }

    public FreeTrialSpecification(FreeTrialCriteria criteria) {
        super(criteria);
    }

    public FreeTrialSpecification(FreeTrialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
