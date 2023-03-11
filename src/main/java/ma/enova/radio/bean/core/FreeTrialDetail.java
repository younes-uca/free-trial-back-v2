package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.service.util.EmailMessage;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "free_trial_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "free_trial_detail_seq", sequenceName = "free_trial_detail_seq", allocationSize = 1, initialValue = 1)
public class FreeTrialDetail extends AuditBusinessObject implements EmailMessage {

    private Long id;

    @Column(columnDefinition = "boolean default false")
    private Boolean presence = false;
    @Column(columnDefinition = "boolean default false")
    private Boolean whatsUpMessageSent = false;
    private LocalDateTime dateEnvoiwhatsUpMessage;
    @Column(columnDefinition = "boolean default false")
    private Boolean emailMessageSent = false;
    private LocalDateTime dateEnvoiEmailMessage;
    @Column(columnDefinition = "boolean default false")
    private Boolean abonne = false;

    private FreeTrial freeTrial;

    private Student student;

    @Column(length = 500)
    private String reference;


    public FreeTrialDetail() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "free_trial_detail_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrial getFreeTrial() {
        return this.freeTrial;
    }

    public void setFreeTrial(FreeTrial freeTrial) {
        this.freeTrial = freeTrial;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Boolean getPresence() {
        return this.presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    public Boolean getWhatsUpMessageSent() {
        return this.whatsUpMessageSent;
    }

    public void setWhatsUpMessageSent(Boolean whatsUpMessageSent) {
        this.whatsUpMessageSent = whatsUpMessageSent;
    }

    public LocalDateTime getDateEnvoiwhatsUpMessage() {
        return this.dateEnvoiwhatsUpMessage;
    }

    public void setDateEnvoiwhatsUpMessage(LocalDateTime dateEnvoiwhatsUpMessage) {
        this.dateEnvoiwhatsUpMessage = dateEnvoiwhatsUpMessage;
    }

    public Boolean getEmailMessageSent() {
        return this.emailMessageSent;
    }

    public void setEmailMessageSent(Boolean emailMessageSent) {
        this.emailMessageSent = emailMessageSent;
    }

    public LocalDateTime getDateEnvoiEmailMessage() {
        return this.dateEnvoiEmailMessage;
    }

    public void setDateEnvoiEmailMessage(LocalDateTime dateEnvoiEmailMessage) {
        this.dateEnvoiEmailMessage = dateEnvoiEmailMessage;
    }

    public Boolean getAbonne() {
        return this.abonne;
    }

    public void setAbonne(Boolean abonne) {
        this.abonne = abonne;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeTrialDetail freeTrialDetail = (FreeTrialDetail) o;
        return id != null && id.equals(freeTrialDetail.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    @Transient
    public String getFrom() {
        if (this.getFreeTrial() != null && this.getFreeTrial().getFreeTrialStudentEmailTemplate() != null)
            return this.getFreeTrial().getFreeTrialStudentEmailTemplate().getSource();
        return null;
    }

    @Override
    @Transient
    public String getObject() {
        if (this.getFreeTrial() != null && this.getFreeTrial().getFreeTrialStudentEmailTemplate() != null)
            return this.getFreeTrial().getFreeTrialStudentEmailTemplate().getObject();
        return null;
    }

    @Override
    @Transient
    public String getCorps() {
        if (this.getFreeTrial() != null && this.getFreeTrial().getFreeTrialStudentEmailTemplate() != null)
            return this.getFreeTrial().getFreeTrialStudentEmailTemplate().getCorps();
        return null;
    }

    @Override
    @Transient
    public String getTo() {
        if (student != null)
            return student.getEmail();
        return null;
    }

    @Override
    @Transient
    public String getCc() {
        return null;
    }

    @Override
    @Transient
    public void setEmailSent(boolean emailSent) {
        this.emailMessageSent = emailSent;
    }

    @Override
    @Transient
    public void setSendingDate(LocalDateTime sendingDate) {
        this.dateEnvoiEmailMessage = sendingDate;
    }
}

