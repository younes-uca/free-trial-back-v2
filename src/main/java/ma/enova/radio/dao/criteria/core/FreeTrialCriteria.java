package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;


public class FreeTrialCriteria extends BaseCriteria {

    private LocalDateTime dateFreeTrial;
    private LocalDateTime dateFreeTrialFrom;
    private LocalDateTime dateFreeTrialTo;
    private String link;
    private String linkLike;
    private LocalDateTime dateFreeTrialPremierRappel;
    private LocalDateTime dateFreeTrialPremierRappelFrom;
    private LocalDateTime dateFreeTrialPremierRappelTo;
    private LocalDateTime dateFreeTrialDeuxiemeRappel;
    private LocalDateTime dateFreeTrialDeuxiemeRappelFrom;
    private LocalDateTime dateFreeTrialDeuxiemeRappelTo;
    private String nombreStudentTotal;
    private String nombreStudentTotalMin;
    private String nombreStudentTotalMax;
    private String nombreStudentAbonne;
    private String nombreStudentAbonneMin;
    private String nombreStudentAbonneMax;
    private String nombreStudentPresent;
    private String nombreStudentPresentMin;
    private String nombreStudentPresentMax;

    private TeacherCriteria teacher;
    private List<TeacherCriteria> teachers;
    private LevelCriteria level;
    private List<LevelCriteria> levels;
    private FreeTrialStudentWhatsTemplateCriteria freeTrialStudentWhatsTemplate;
    private List<FreeTrialStudentWhatsTemplateCriteria> freeTrialStudentWhatsTemplates;
    private FreeTrialStudentEmailTemplateCriteria freeTrialStudentEmailTemplate;
    private List<FreeTrialStudentEmailTemplateCriteria> freeTrialStudentEmailTemplates;
    private FreeTrialTeacherEmailTemplateCriteria freeTrialTeacherEmailTemplate;
    private List<FreeTrialTeacherEmailTemplateCriteria> freeTrialTeacherEmailTemplates;
    private FreeTrialTeacherWhatsTemplateCriteria freeTrialTeacherWhatsTemplate;
    private List<FreeTrialTeacherWhatsTemplateCriteria> freeTrialTeacherWhatsTemplates;
    private FreeTrialConfigurationCriteria freeTrialConfiguration;
    private List<FreeTrialConfigurationCriteria> freeTrialConfigurations;
    private StatutFreeTrialCriteria statutFreeTrial;
    private List<StatutFreeTrialCriteria> statutFreeTrials;


    public FreeTrialCriteria() {
    }

    public LocalDateTime getDateFreeTrial() {
        return this.dateFreeTrial;
    }

    public void setDateFreeTrial(LocalDateTime dateFreeTrial) {
        this.dateFreeTrial = dateFreeTrial;
    }

    public LocalDateTime getDateFreeTrialFrom() {
        return this.dateFreeTrialFrom;
    }

    public void setDateFreeTrialFrom(LocalDateTime dateFreeTrialFrom) {
        this.dateFreeTrialFrom = dateFreeTrialFrom;
    }

    public LocalDateTime getDateFreeTrialTo() {
        return this.dateFreeTrialTo;
    }

    public void setDateFreeTrialTo(LocalDateTime dateFreeTrialTo) {
        this.dateFreeTrialTo = dateFreeTrialTo;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkLike() {
        return this.linkLike;
    }

    public void setLinkLike(String linkLike) {
        this.linkLike = linkLike;
    }

    public LocalDateTime getDateFreeTrialPremierRappel() {
        return this.dateFreeTrialPremierRappel;
    }

    public void setDateFreeTrialPremierRappel(LocalDateTime dateFreeTrialPremierRappel) {
        this.dateFreeTrialPremierRappel = dateFreeTrialPremierRappel;
    }

    public LocalDateTime getDateFreeTrialPremierRappelFrom() {
        return this.dateFreeTrialPremierRappelFrom;
    }

    public void setDateFreeTrialPremierRappelFrom(LocalDateTime dateFreeTrialPremierRappelFrom) {
        this.dateFreeTrialPremierRappelFrom = dateFreeTrialPremierRappelFrom;
    }

    public LocalDateTime getDateFreeTrialPremierRappelTo() {
        return this.dateFreeTrialPremierRappelTo;
    }

    public void setDateFreeTrialPremierRappelTo(LocalDateTime dateFreeTrialPremierRappelTo) {
        this.dateFreeTrialPremierRappelTo = dateFreeTrialPremierRappelTo;
    }

    public LocalDateTime getDateFreeTrialDeuxiemeRappel() {
        return this.dateFreeTrialDeuxiemeRappel;
    }

    public void setDateFreeTrialDeuxiemeRappel(LocalDateTime dateFreeTrialDeuxiemeRappel) {
        this.dateFreeTrialDeuxiemeRappel = dateFreeTrialDeuxiemeRappel;
    }

    public LocalDateTime getDateFreeTrialDeuxiemeRappelFrom() {
        return this.dateFreeTrialDeuxiemeRappelFrom;
    }

    public void setDateFreeTrialDeuxiemeRappelFrom(LocalDateTime dateFreeTrialDeuxiemeRappelFrom) {
        this.dateFreeTrialDeuxiemeRappelFrom = dateFreeTrialDeuxiemeRappelFrom;
    }

    public LocalDateTime getDateFreeTrialDeuxiemeRappelTo() {
        return this.dateFreeTrialDeuxiemeRappelTo;
    }

    public void setDateFreeTrialDeuxiemeRappelTo(LocalDateTime dateFreeTrialDeuxiemeRappelTo) {
        this.dateFreeTrialDeuxiemeRappelTo = dateFreeTrialDeuxiemeRappelTo;
    }

    public String getNombreStudentTotal() {
        return this.nombreStudentTotal;
    }

    public void setNombreStudentTotal(String nombreStudentTotal) {
        this.nombreStudentTotal = nombreStudentTotal;
    }

    public String getNombreStudentTotalMin() {
        return this.nombreStudentTotalMin;
    }

    public void setNombreStudentTotalMin(String nombreStudentTotalMin) {
        this.nombreStudentTotalMin = nombreStudentTotalMin;
    }

    public String getNombreStudentTotalMax() {
        return this.nombreStudentTotalMax;
    }

    public void setNombreStudentTotalMax(String nombreStudentTotalMax) {
        this.nombreStudentTotalMax = nombreStudentTotalMax;
    }

    public String getNombreStudentAbonne() {
        return this.nombreStudentAbonne;
    }

    public void setNombreStudentAbonne(String nombreStudentAbonne) {
        this.nombreStudentAbonne = nombreStudentAbonne;
    }

    public String getNombreStudentAbonneMin() {
        return this.nombreStudentAbonneMin;
    }

    public void setNombreStudentAbonneMin(String nombreStudentAbonneMin) {
        this.nombreStudentAbonneMin = nombreStudentAbonneMin;
    }

    public String getNombreStudentAbonneMax() {
        return this.nombreStudentAbonneMax;
    }

    public void setNombreStudentAbonneMax(String nombreStudentAbonneMax) {
        this.nombreStudentAbonneMax = nombreStudentAbonneMax;
    }

    public String getNombreStudentPresent() {
        return this.nombreStudentPresent;
    }

    public void setNombreStudentPresent(String nombreStudentPresent) {
        this.nombreStudentPresent = nombreStudentPresent;
    }

    public String getNombreStudentPresentMin() {
        return this.nombreStudentPresentMin;
    }

    public void setNombreStudentPresentMin(String nombreStudentPresentMin) {
        this.nombreStudentPresentMin = nombreStudentPresentMin;
    }

    public String getNombreStudentPresentMax() {
        return this.nombreStudentPresentMax;
    }

    public void setNombreStudentPresentMax(String nombreStudentPresentMax) {
        this.nombreStudentPresentMax = nombreStudentPresentMax;
    }


    public TeacherCriteria getTeacher() {
        return this.teacher;
    }

    public void setTeacher(TeacherCriteria teacher) {
        this.teacher = teacher;
    }

    public List<TeacherCriteria> getTeachers() {
        return this.teachers;
    }

    public void setTeachers(List<TeacherCriteria> teachers) {
        this.teachers = teachers;
    }

    public LevelCriteria getLevel() {
        return this.level;
    }

    public void setLevel(LevelCriteria level) {
        this.level = level;
    }

    public List<LevelCriteria> getLevels() {
        return this.levels;
    }

    public void setLevels(List<LevelCriteria> levels) {
        this.levels = levels;
    }

    public FreeTrialStudentWhatsTemplateCriteria getFreeTrialStudentWhatsTemplate() {
        return this.freeTrialStudentWhatsTemplate;
    }

    public void setFreeTrialStudentWhatsTemplate(FreeTrialStudentWhatsTemplateCriteria freeTrialStudentWhatsTemplate) {
        this.freeTrialStudentWhatsTemplate = freeTrialStudentWhatsTemplate;
    }

    public List<FreeTrialStudentWhatsTemplateCriteria> getFreeTrialStudentWhatsTemplates() {
        return this.freeTrialStudentWhatsTemplates;
    }

    public void setFreeTrialStudentWhatsTemplates(List<FreeTrialStudentWhatsTemplateCriteria> freeTrialStudentWhatsTemplates) {
        this.freeTrialStudentWhatsTemplates = freeTrialStudentWhatsTemplates;
    }

    public FreeTrialStudentEmailTemplateCriteria getFreeTrialStudentEmailTemplate() {
        return this.freeTrialStudentEmailTemplate;
    }

    public void setFreeTrialStudentEmailTemplate(FreeTrialStudentEmailTemplateCriteria freeTrialStudentEmailTemplate) {
        this.freeTrialStudentEmailTemplate = freeTrialStudentEmailTemplate;
    }

    public List<FreeTrialStudentEmailTemplateCriteria> getFreeTrialStudentEmailTemplates() {
        return this.freeTrialStudentEmailTemplates;
    }

    public void setFreeTrialStudentEmailTemplates(List<FreeTrialStudentEmailTemplateCriteria> freeTrialStudentEmailTemplates) {
        this.freeTrialStudentEmailTemplates = freeTrialStudentEmailTemplates;
    }

    public FreeTrialTeacherEmailTemplateCriteria getFreeTrialTeacherEmailTemplate() {
        return this.freeTrialTeacherEmailTemplate;
    }

    public void setFreeTrialTeacherEmailTemplate(FreeTrialTeacherEmailTemplateCriteria freeTrialTeacherEmailTemplate) {
        this.freeTrialTeacherEmailTemplate = freeTrialTeacherEmailTemplate;
    }

    public List<FreeTrialTeacherEmailTemplateCriteria> getFreeTrialTeacherEmailTemplates() {
        return this.freeTrialTeacherEmailTemplates;
    }

    public void setFreeTrialTeacherEmailTemplates(List<FreeTrialTeacherEmailTemplateCriteria> freeTrialTeacherEmailTemplates) {
        this.freeTrialTeacherEmailTemplates = freeTrialTeacherEmailTemplates;
    }

    public FreeTrialTeacherWhatsTemplateCriteria getFreeTrialTeacherWhatsTemplate() {
        return this.freeTrialTeacherWhatsTemplate;
    }

    public void setFreeTrialTeacherWhatsTemplate(FreeTrialTeacherWhatsTemplateCriteria freeTrialTeacherWhatsTemplate) {
        this.freeTrialTeacherWhatsTemplate = freeTrialTeacherWhatsTemplate;
    }

    public List<FreeTrialTeacherWhatsTemplateCriteria> getFreeTrialTeacherWhatsTemplates() {
        return this.freeTrialTeacherWhatsTemplates;
    }

    public void setFreeTrialTeacherWhatsTemplates(List<FreeTrialTeacherWhatsTemplateCriteria> freeTrialTeacherWhatsTemplates) {
        this.freeTrialTeacherWhatsTemplates = freeTrialTeacherWhatsTemplates;
    }

    public FreeTrialConfigurationCriteria getFreeTrialConfiguration() {
        return this.freeTrialConfiguration;
    }

    public void setFreeTrialConfiguration(FreeTrialConfigurationCriteria freeTrialConfiguration) {
        this.freeTrialConfiguration = freeTrialConfiguration;
    }

    public List<FreeTrialConfigurationCriteria> getFreeTrialConfigurations() {
        return this.freeTrialConfigurations;
    }

    public void setFreeTrialConfigurations(List<FreeTrialConfigurationCriteria> freeTrialConfigurations) {
        this.freeTrialConfigurations = freeTrialConfigurations;
    }

    public StatutFreeTrialCriteria getStatutFreeTrial() {
        return this.statutFreeTrial;
    }

    public void setStatutFreeTrial(StatutFreeTrialCriteria statutFreeTrial) {
        this.statutFreeTrial = statutFreeTrial;
    }

    public List<StatutFreeTrialCriteria> getStatutFreeTrials() {
        return this.statutFreeTrials;
    }

    public void setStatutFreeTrials(List<StatutFreeTrialCriteria> statutFreeTrials) {
        this.statutFreeTrials = statutFreeTrials;
    }
}
