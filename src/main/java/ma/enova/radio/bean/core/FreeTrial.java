package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "free_trial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "free_trial_seq", sequenceName = "free_trial_seq", allocationSize = 1, initialValue = 1)
public class FreeTrial extends AuditBusinessObject {

    private Long id;

    private LocalDateTime dateFreeTrial;
    @Column(length = 500)
    private String link;

    @Column(length = 500)
    private String Reference;
    private LocalDateTime dateFreeTrialPremierRappel;
    private LocalDateTime dateFreeTrialDeuxiemeRappel;
    private Integer nombreStudentTotal = 0;
    private Integer nombreStudentAbonne = 0;
    private Integer nombreStudentPresent = 0;

    private Teacher teacher;

    private Level level;

    private FreeTrialStudentWhatsTemplate freeTrialStudentWhatsTemplate;

    private FreeTrialStudentEmailTemplate freeTrialStudentEmailTemplate;

    private FreeTrialTeacherEmailTemplate freeTrialTeacherEmailTemplate;

    private FreeTrialTeacherWhatsTemplate freeTrialTeacherWhatsTemplate;

    private FreeTrialConfiguration freeTrialConfiguration;

    private StatutFreeTrial statutFreeTrial;


    private List<FreeTrialDetail> freeTrialDetails;

    public FreeTrial() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "free_trial_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public LocalDateTime getDateFreeTrial() {
        return this.dateFreeTrial;
    }

    public void setDateFreeTrial(LocalDateTime dateFreeTrial) {
        this.dateFreeTrial = dateFreeTrial;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrialStudentWhatsTemplate getFreeTrialStudentWhatsTemplate() {
        return this.freeTrialStudentWhatsTemplate;
    }

    public void setFreeTrialStudentWhatsTemplate(FreeTrialStudentWhatsTemplate freeTrialStudentWhatsTemplate) {
        this.freeTrialStudentWhatsTemplate = freeTrialStudentWhatsTemplate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrialStudentEmailTemplate getFreeTrialStudentEmailTemplate() {
        return this.freeTrialStudentEmailTemplate;
    }

    public void setFreeTrialStudentEmailTemplate(FreeTrialStudentEmailTemplate freeTrialStudentEmailTemplate) {
        this.freeTrialStudentEmailTemplate = freeTrialStudentEmailTemplate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrialTeacherEmailTemplate getFreeTrialTeacherEmailTemplate() {
        return this.freeTrialTeacherEmailTemplate;
    }

    public void setFreeTrialTeacherEmailTemplate(FreeTrialTeacherEmailTemplate freeTrialTeacherEmailTemplate) {
        this.freeTrialTeacherEmailTemplate = freeTrialTeacherEmailTemplate;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrialTeacherWhatsTemplate getFreeTrialTeacherWhatsTemplate() {
        return this.freeTrialTeacherWhatsTemplate;
    }

    public void setFreeTrialTeacherWhatsTemplate(FreeTrialTeacherWhatsTemplate freeTrialTeacherWhatsTemplate) {
        this.freeTrialTeacherWhatsTemplate = freeTrialTeacherWhatsTemplate;
    }

    public LocalDateTime getDateFreeTrialPremierRappel() {
        return this.dateFreeTrialPremierRappel;
    }

    public void setDateFreeTrialPremierRappel(LocalDateTime dateFreeTrialPremierRappel) {
        this.dateFreeTrialPremierRappel = dateFreeTrialPremierRappel;
    }

    public LocalDateTime getDateFreeTrialDeuxiemeRappel() {
        return this.dateFreeTrialDeuxiemeRappel;
    }

    public void setDateFreeTrialDeuxiemeRappel(LocalDateTime dateFreeTrialDeuxiemeRappel) {
        this.dateFreeTrialDeuxiemeRappel = dateFreeTrialDeuxiemeRappel;
    }

    public Integer getNombreStudentTotal() {
        return this.nombreStudentTotal;
    }

    public void setNombreStudentTotal(Integer nombreStudentTotal) {
        this.nombreStudentTotal = nombreStudentTotal;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public FreeTrialConfiguration getFreeTrialConfiguration() {
        return this.freeTrialConfiguration;
    }

    public void setFreeTrialConfiguration(FreeTrialConfiguration freeTrialConfiguration) {
        this.freeTrialConfiguration = freeTrialConfiguration;
    }

    public Integer getNombreStudentAbonne() {
        return this.nombreStudentAbonne;
    }

    public void setNombreStudentAbonne(Integer nombreStudentAbonne) {
        this.nombreStudentAbonne = nombreStudentAbonne;
    }

    public Integer getNombreStudentPresent() {
        return this.nombreStudentPresent;
    }

    public void setNombreStudentPresent(Integer nombreStudentPresent) {
        this.nombreStudentPresent = nombreStudentPresent;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    public StatutFreeTrial getStatutFreeTrial() {
        return this.statutFreeTrial;
    }

    public void setStatutFreeTrial(StatutFreeTrial statutFreeTrial) {
        this.statutFreeTrial = statutFreeTrial;
    }

    @OneToMany(mappedBy = "freeTrial")
    public List<FreeTrialDetail> getFreeTrialDetails() {
        return this.freeTrialDetails;
    }

    public void setFreeTrialDetails(List<FreeTrialDetail> freeTrialDetails) {
        this.freeTrialDetails = freeTrialDetails;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeTrial freeTrial = (FreeTrial) o;
        return id != null && id.equals(freeTrial.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

