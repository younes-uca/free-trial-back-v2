package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreeTrialDto extends AuditBaseDto {

    private String dateFreeTrial;
    private String link;
    private String dateFreeTrialPremierRappel;
    private String dateFreeTrialDeuxiemeRappel;
    private Integer nombreStudentTotal = 0;
    private Integer nombreStudentAbonne = 0;
    private Integer nombreStudentPresent = 0;

    private TeacherDto teacher;
    private LevelDto level;
    private FreeTrialStudentWhatsTemplateDto freeTrialStudentWhatsTemplate;
    private FreeTrialStudentEmailTemplateDto freeTrialStudentEmailTemplate;
    private FreeTrialTeacherEmailTemplateDto freeTrialTeacherEmailTemplate;
    private FreeTrialTeacherWhatsTemplateDto freeTrialTeacherWhatsTemplate;
    private FreeTrialConfigurationDto freeTrialConfiguration;
    private StatutFreeTrialDto statutFreeTrial;

    private List<FreeTrialDetailDto> freeTrialDetails;

    public FreeTrialDto() {
        super();
    }


    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFreeTrial() {
        return this.dateFreeTrial;
    }

    public void setDateFreeTrial(String dateFreeTrial) {
        this.dateFreeTrial = dateFreeTrial;
    }

    @Log
    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFreeTrialPremierRappel() {
        return this.dateFreeTrialPremierRappel;
    }

    public void setDateFreeTrialPremierRappel(String dateFreeTrialPremierRappel) {
        this.dateFreeTrialPremierRappel = dateFreeTrialPremierRappel;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFreeTrialDeuxiemeRappel() {
        return this.dateFreeTrialDeuxiemeRappel;
    }

    public void setDateFreeTrialDeuxiemeRappel(String dateFreeTrialDeuxiemeRappel) {
        this.dateFreeTrialDeuxiemeRappel = dateFreeTrialDeuxiemeRappel;
    }

    @Log
    public Integer getNombreStudentTotal() {
        return this.nombreStudentTotal;
    }

    public void setNombreStudentTotal(Integer nombreStudentTotal) {
        this.nombreStudentTotal = nombreStudentTotal;
    }

    @Log
    public Integer getNombreStudentAbonne() {
        return this.nombreStudentAbonne;
    }

    public void setNombreStudentAbonne(Integer nombreStudentAbonne) {
        this.nombreStudentAbonne = nombreStudentAbonne;
    }

    @Log
    public Integer getNombreStudentPresent() {
        return this.nombreStudentPresent;
    }

    public void setNombreStudentPresent(Integer nombreStudentPresent) {
        this.nombreStudentPresent = nombreStudentPresent;
    }


    public TeacherDto getTeacher() {
        return this.teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
    }

    public LevelDto getLevel() {
        return this.level;
    }

    public void setLevel(LevelDto level) {
        this.level = level;
    }

    public FreeTrialStudentWhatsTemplateDto getFreeTrialStudentWhatsTemplate() {
        return this.freeTrialStudentWhatsTemplate;
    }

    public void setFreeTrialStudentWhatsTemplate(FreeTrialStudentWhatsTemplateDto freeTrialStudentWhatsTemplate) {
        this.freeTrialStudentWhatsTemplate = freeTrialStudentWhatsTemplate;
    }

    public FreeTrialStudentEmailTemplateDto getFreeTrialStudentEmailTemplate() {
        return this.freeTrialStudentEmailTemplate;
    }

    public void setFreeTrialStudentEmailTemplate(FreeTrialStudentEmailTemplateDto freeTrialStudentEmailTemplate) {
        this.freeTrialStudentEmailTemplate = freeTrialStudentEmailTemplate;
    }

    public FreeTrialTeacherEmailTemplateDto getFreeTrialTeacherEmailTemplate() {
        return this.freeTrialTeacherEmailTemplate;
    }

    public void setFreeTrialTeacherEmailTemplate(FreeTrialTeacherEmailTemplateDto freeTrialTeacherEmailTemplate) {
        this.freeTrialTeacherEmailTemplate = freeTrialTeacherEmailTemplate;
    }

    public FreeTrialTeacherWhatsTemplateDto getFreeTrialTeacherWhatsTemplate() {
        return this.freeTrialTeacherWhatsTemplate;
    }

    public void setFreeTrialTeacherWhatsTemplate(FreeTrialTeacherWhatsTemplateDto freeTrialTeacherWhatsTemplate) {
        this.freeTrialTeacherWhatsTemplate = freeTrialTeacherWhatsTemplate;
    }

    public FreeTrialConfigurationDto getFreeTrialConfiguration() {
        return this.freeTrialConfiguration;
    }

    public void setFreeTrialConfiguration(FreeTrialConfigurationDto freeTrialConfiguration) {
        this.freeTrialConfiguration = freeTrialConfiguration;
    }

    public StatutFreeTrialDto getStatutFreeTrial() {
        return this.statutFreeTrial;
    }

    public void setStatutFreeTrial(StatutFreeTrialDto statutFreeTrial) {
        this.statutFreeTrial = statutFreeTrial;
    }

    public List<FreeTrialDetailDto> getFreeTrialDetails() {
        return this.freeTrialDetails;
    }

    public void setFreeTrialDetails(List<FreeTrialDetailDto> freeTrialDetails) {
        this.freeTrialDetails = freeTrialDetails;
    }

}
