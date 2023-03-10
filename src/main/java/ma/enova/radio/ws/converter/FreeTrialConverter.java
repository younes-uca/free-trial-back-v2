package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.history.FreeTrialHistory;
import ma.enova.radio.ws.dto.FreeTrialDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.ListUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FreeTrialConverter extends AbstractConverter<FreeTrial, FreeTrialDto, FreeTrialHistory> {

    @Autowired
    private StatutFreeTrialConverter statutFreeTrialConverter;
    @Autowired
    private FreeTrialStudentEmailTemplateConverter freeTrialStudentEmailTemplateConverter;
    @Autowired
    private FreeTrialConfigurationConverter freeTrialConfigurationConverter;
    @Autowired
    private StudentConverter studentConverter;
    @Autowired
    private TeacherConverter teacherConverter;
    @Autowired
    private FreeTrialTeacherEmailTemplateConverter freeTrialTeacherEmailTemplateConverter;
    @Autowired
    private FreeTrialTeacherWhatsTemplateConverter freeTrialTeacherWhatsTemplateConverter;
    @Autowired
    private LevelConverter levelConverter;
    @Autowired
    private FreeTrialStudentWhatsTemplateConverter freeTrialStudentWhatsTemplateConverter;
    @Autowired
    private FreeTrialDetailConverter freeTrialDetailConverter;
    private boolean teacher;
    private boolean level;
    private boolean freeTrialStudentWhatsTemplate;
    private boolean freeTrialStudentEmailTemplate;
    private boolean freeTrialTeacherEmailTemplate;
    private boolean freeTrialTeacherWhatsTemplate;
    private boolean freeTrialConfiguration;
    private boolean statutFreeTrial;
    private boolean freeTrialDetails;

    public FreeTrialConverter() {
        super(FreeTrial.class, FreeTrialDto.class, FreeTrialHistory.class);
        init(true);
    }

    @Override
    public FreeTrial toItem(FreeTrialDto dto) {
        if (dto == null) {
            return null;
        } else {
            FreeTrial item = new FreeTrial();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getDateFreeTrial()))
                item.setDateFreeTrial(DateUtil.stringEnToDate(dto.getDateFreeTrial()));
            if (StringUtil.isNotEmpty(dto.getLink()))
                item.setLink(dto.getLink());
            if (StringUtil.isNotEmpty(dto.getDateFreeTrialPremierRappel()))
                item.setDateFreeTrialPremierRappel(DateUtil.stringEnToDate(dto.getDateFreeTrialPremierRappel()));
            if (StringUtil.isNotEmpty(dto.getDateFreeTrialDeuxiemeRappel()))
                item.setDateFreeTrialDeuxiemeRappel(DateUtil.stringEnToDate(dto.getDateFreeTrialDeuxiemeRappel()));
            if (StringUtil.isNotEmpty(dto.getNombreStudentTotal()))
                item.setNombreStudentTotal(dto.getNombreStudentTotal());
            if (StringUtil.isNotEmpty(dto.getNombreStudentAbonne()))
                item.setNombreStudentAbonne(dto.getNombreStudentAbonne());
            if (StringUtil.isNotEmpty(dto.getNombreStudentPresent()))
                item.setNombreStudentPresent(dto.getNombreStudentPresent());
            if (this.teacher && dto.getTeacher() != null)
                item.setTeacher(teacherConverter.toItem(dto.getTeacher()));

            if (this.level && dto.getLevel() != null)
                item.setLevel(levelConverter.toItem(dto.getLevel()));

            if (this.freeTrialStudentWhatsTemplate && dto.getFreeTrialStudentWhatsTemplate() != null)
                item.setFreeTrialStudentWhatsTemplate(freeTrialStudentWhatsTemplateConverter.toItem(dto.getFreeTrialStudentWhatsTemplate()));

            if (this.freeTrialStudentEmailTemplate && dto.getFreeTrialStudentEmailTemplate() != null)
                item.setFreeTrialStudentEmailTemplate(freeTrialStudentEmailTemplateConverter.toItem(dto.getFreeTrialStudentEmailTemplate()));

            if (this.freeTrialTeacherEmailTemplate && dto.getFreeTrialTeacherEmailTemplate() != null)
                item.setFreeTrialTeacherEmailTemplate(freeTrialTeacherEmailTemplateConverter.toItem(dto.getFreeTrialTeacherEmailTemplate()));

            if (this.freeTrialTeacherWhatsTemplate && dto.getFreeTrialTeacherWhatsTemplate() != null)
                item.setFreeTrialTeacherWhatsTemplate(freeTrialTeacherWhatsTemplateConverter.toItem(dto.getFreeTrialTeacherWhatsTemplate()));

            if (this.freeTrialConfiguration && dto.getFreeTrialConfiguration() != null)
                item.setFreeTrialConfiguration(freeTrialConfigurationConverter.toItem(dto.getFreeTrialConfiguration()));

            if (this.statutFreeTrial && dto.getStatutFreeTrial() != null)
                item.setStatutFreeTrial(statutFreeTrialConverter.toItem(dto.getStatutFreeTrial()));


            if (this.freeTrialDetails && ListUtil.isNotEmpty(dto.getFreeTrialDetails()))
                item.setFreeTrialDetails(freeTrialDetailConverter.toItem(dto.getFreeTrialDetails()));

            return item;
        }
    }

    @Override
    public FreeTrialDto toDto(FreeTrial item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialDto dto = new FreeTrialDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (item.getDateFreeTrial() != null)
                dto.setDateFreeTrial(DateUtil.dateTimeToString(item.getDateFreeTrial()));
            if (StringUtil.isNotEmpty(item.getLink()))
                dto.setLink(item.getLink());
            if (item.getDateFreeTrialPremierRappel() != null)
                dto.setDateFreeTrialPremierRappel(DateUtil.dateTimeToString(item.getDateFreeTrialPremierRappel()));
            if (item.getDateFreeTrialDeuxiemeRappel() != null)
                dto.setDateFreeTrialDeuxiemeRappel(DateUtil.dateTimeToString(item.getDateFreeTrialDeuxiemeRappel()));
            if (StringUtil.isNotEmpty(item.getNombreStudentTotal()))
                dto.setNombreStudentTotal(item.getNombreStudentTotal());
            if (StringUtil.isNotEmpty(item.getNombreStudentAbonne()))
                dto.setNombreStudentAbonne(item.getNombreStudentAbonne());
            if (StringUtil.isNotEmpty(item.getNombreStudentPresent()))
                dto.setNombreStudentPresent(item.getNombreStudentPresent());
            if (this.teacher && item.getTeacher() != null) {
                dto.setTeacher(teacherConverter.toDto(item.getTeacher()));
            }
            if (this.level && item.getLevel() != null) {
                dto.setLevel(levelConverter.toDto(item.getLevel()));
            }
            if (this.freeTrialStudentWhatsTemplate && item.getFreeTrialStudentWhatsTemplate() != null) {
                dto.setFreeTrialStudentWhatsTemplate(freeTrialStudentWhatsTemplateConverter.toDto(item.getFreeTrialStudentWhatsTemplate()));
            }
            if (this.freeTrialStudentEmailTemplate && item.getFreeTrialStudentEmailTemplate() != null) {
                dto.setFreeTrialStudentEmailTemplate(freeTrialStudentEmailTemplateConverter.toDto(item.getFreeTrialStudentEmailTemplate()));
            }
            if (this.freeTrialTeacherEmailTemplate && item.getFreeTrialTeacherEmailTemplate() != null) {
                dto.setFreeTrialTeacherEmailTemplate(freeTrialTeacherEmailTemplateConverter.toDto(item.getFreeTrialTeacherEmailTemplate()));
            }
            if (this.freeTrialTeacherWhatsTemplate && item.getFreeTrialTeacherWhatsTemplate() != null) {
                dto.setFreeTrialTeacherWhatsTemplate(freeTrialTeacherWhatsTemplateConverter.toDto(item.getFreeTrialTeacherWhatsTemplate()));
            }
            if (this.freeTrialConfiguration && item.getFreeTrialConfiguration() != null) {
                dto.setFreeTrialConfiguration(freeTrialConfigurationConverter.toDto(item.getFreeTrialConfiguration()));
            }
            if (this.statutFreeTrial && item.getStatutFreeTrial() != null) {
                dto.setStatutFreeTrial(statutFreeTrialConverter.toDto(item.getStatutFreeTrial()));
            }
            if (this.freeTrialDetails && ListUtil.isNotEmpty(item.getFreeTrialDetails())) {
                freeTrialDetailConverter.init(true);
                freeTrialDetailConverter.setFreeTrial(false);
                dto.setFreeTrialDetails(freeTrialDetailConverter.toDto(item.getFreeTrialDetails()));
                freeTrialDetailConverter.setFreeTrial(true);

            }
            return dto;
        }
    }

    public void initList(boolean value) {
        this.freeTrialDetails = value;
    }

    public void initObject(boolean value) {
        this.teacher = value;
        this.level = value;
        this.freeTrialStudentWhatsTemplate = value;
        this.freeTrialStudentEmailTemplate = value;
        this.freeTrialTeacherEmailTemplate = value;
        this.freeTrialTeacherWhatsTemplate = value;
        this.freeTrialConfiguration = value;
        this.statutFreeTrial = value;
    }


    public StatutFreeTrialConverter getStatutFreeTrialConverter() {
        return this.statutFreeTrialConverter;
    }

    public void setStatutFreeTrialConverter(StatutFreeTrialConverter statutFreeTrialConverter) {
        this.statutFreeTrialConverter = statutFreeTrialConverter;
    }

    public FreeTrialStudentEmailTemplateConverter getFreeTrialStudentEmailTemplateConverter() {
        return this.freeTrialStudentEmailTemplateConverter;
    }

    public void setFreeTrialStudentEmailTemplateConverter(FreeTrialStudentEmailTemplateConverter freeTrialStudentEmailTemplateConverter) {
        this.freeTrialStudentEmailTemplateConverter = freeTrialStudentEmailTemplateConverter;
    }

    public FreeTrialConfigurationConverter getFreeTrialConfigurationConverter() {
        return this.freeTrialConfigurationConverter;
    }

    public void setFreeTrialConfigurationConverter(FreeTrialConfigurationConverter freeTrialConfigurationConverter) {
        this.freeTrialConfigurationConverter = freeTrialConfigurationConverter;
    }

    public StudentConverter getStudentConverter() {
        return this.studentConverter;
    }

    public void setStudentConverter(StudentConverter studentConverter) {
        this.studentConverter = studentConverter;
    }

    public TeacherConverter getTeacherConverter() {
        return this.teacherConverter;
    }

    public void setTeacherConverter(TeacherConverter teacherConverter) {
        this.teacherConverter = teacherConverter;
    }

    public FreeTrialTeacherEmailTemplateConverter getFreeTrialTeacherEmailTemplateConverter() {
        return this.freeTrialTeacherEmailTemplateConverter;
    }

    public void setFreeTrialTeacherEmailTemplateConverter(FreeTrialTeacherEmailTemplateConverter freeTrialTeacherEmailTemplateConverter) {
        this.freeTrialTeacherEmailTemplateConverter = freeTrialTeacherEmailTemplateConverter;
    }

    public FreeTrialTeacherWhatsTemplateConverter getFreeTrialTeacherWhatsTemplateConverter() {
        return this.freeTrialTeacherWhatsTemplateConverter;
    }

    public void setFreeTrialTeacherWhatsTemplateConverter(FreeTrialTeacherWhatsTemplateConverter freeTrialTeacherWhatsTemplateConverter) {
        this.freeTrialTeacherWhatsTemplateConverter = freeTrialTeacherWhatsTemplateConverter;
    }

    public LevelConverter getLevelConverter() {
        return this.levelConverter;
    }

    public void setLevelConverter(LevelConverter levelConverter) {
        this.levelConverter = levelConverter;
    }

    public FreeTrialStudentWhatsTemplateConverter getFreeTrialStudentWhatsTemplateConverter() {
        return this.freeTrialStudentWhatsTemplateConverter;
    }

    public void setFreeTrialStudentWhatsTemplateConverter(FreeTrialStudentWhatsTemplateConverter freeTrialStudentWhatsTemplateConverter) {
        this.freeTrialStudentWhatsTemplateConverter = freeTrialStudentWhatsTemplateConverter;
    }

    public FreeTrialDetailConverter getFreeTrialDetailConverter() {
        return this.freeTrialDetailConverter;
    }

    public void setFreeTrialDetailConverter(FreeTrialDetailConverter freeTrialDetailConverter) {
        this.freeTrialDetailConverter = freeTrialDetailConverter;
    }


    public boolean isTeacher() {
        return this.teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }

    public boolean isLevel() {
        return this.level;
    }

    public void setLevel(boolean level) {
        this.level = level;
    }

    public boolean isFreeTrialStudentWhatsTemplate() {
        return this.freeTrialStudentWhatsTemplate;
    }

    public void setFreeTrialStudentWhatsTemplate(boolean freeTrialStudentWhatsTemplate) {
        this.freeTrialStudentWhatsTemplate = freeTrialStudentWhatsTemplate;
    }

    public boolean isFreeTrialStudentEmailTemplate() {
        return this.freeTrialStudentEmailTemplate;
    }

    public void setFreeTrialStudentEmailTemplate(boolean freeTrialStudentEmailTemplate) {
        this.freeTrialStudentEmailTemplate = freeTrialStudentEmailTemplate;
    }

    public boolean isFreeTrialTeacherEmailTemplate() {
        return this.freeTrialTeacherEmailTemplate;
    }

    public void setFreeTrialTeacherEmailTemplate(boolean freeTrialTeacherEmailTemplate) {
        this.freeTrialTeacherEmailTemplate = freeTrialTeacherEmailTemplate;
    }

    public boolean isFreeTrialTeacherWhatsTemplate() {
        return this.freeTrialTeacherWhatsTemplate;
    }

    public void setFreeTrialTeacherWhatsTemplate(boolean freeTrialTeacherWhatsTemplate) {
        this.freeTrialTeacherWhatsTemplate = freeTrialTeacherWhatsTemplate;
    }

    public boolean isFreeTrialConfiguration() {
        return this.freeTrialConfiguration;
    }

    public void setFreeTrialConfiguration(boolean freeTrialConfiguration) {
        this.freeTrialConfiguration = freeTrialConfiguration;
    }

    public boolean isStatutFreeTrial() {
        return this.statutFreeTrial;
    }

    public void setStatutFreeTrial(boolean statutFreeTrial) {
        this.statutFreeTrial = statutFreeTrial;
    }

    public boolean isFreeTrialDetails() {
        return this.freeTrialDetails;
    }

    public void setFreeTrialDetails(boolean freeTrialDetails) {
        this.freeTrialDetails = freeTrialDetails;
    }
}
