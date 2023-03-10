package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.dao.criteria.core.FreeTrialDetailCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

public class FreeTrialDetailSpecification extends AbstractSpecification<FreeTrialDetailCriteria, FreeTrialDetail> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBool("presence", criteria.getPresence());
        addPredicateBool("whatsUpMessageSent", criteria.getWhatsUpMessageSent());
        addPredicate("dateEnvoiwhatsUpMessage", criteria.getDateEnvoiwhatsUpMessage(), criteria.getDateEnvoiwhatsUpMessageFrom(), criteria.getDateEnvoiwhatsUpMessageTo());
        addPredicateBool("emailMessageSent", criteria.getEmailMessageSent());
        addPredicate("dateEnvoiEmailMessage", criteria.getDateEnvoiEmailMessage(), criteria.getDateEnvoiEmailMessageFrom(), criteria.getDateEnvoiEmailMessageTo());
        addPredicateBool("abonne", criteria.getAbonne());
        addPredicateFk("freeTrial", "id", criteria.getFreeTrial() == null ? null : criteria.getFreeTrial().getId());
        addPredicateFk("student", "id", criteria.getStudent() == null ? null : criteria.getStudent().getId());
        addPredicateFk("student", "code", criteria.getStudent() == null ? null : criteria.getStudent().getCode());
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
