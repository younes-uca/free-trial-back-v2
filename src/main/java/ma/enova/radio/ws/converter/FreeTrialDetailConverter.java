package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.FreeTrial;
import ma.enova.radio.bean.core.FreeTrialDetail;
import ma.enova.radio.bean.history.FreeTrialDetailHistory;
import ma.enova.radio.ws.dto.FreeTrialDetailDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FreeTrialDetailConverter extends AbstractConverter<FreeTrialDetail, FreeTrialDetailDto, FreeTrialDetailHistory> {

    @Autowired
    private StudentConverter studentConverter;
    @Autowired
    private FreeTrialConverter freeTrialConverter;
    private boolean freeTrial;
    private boolean student;

    public FreeTrialDetailConverter() {
        super(FreeTrialDetail.class, FreeTrialDetailDto.class, FreeTrialDetailHistory.class);
    }

    @Override
    public FreeTrialDetail toItem(FreeTrialDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
            FreeTrialDetail item = new FreeTrialDetail();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (dto.getPresence() != null)
                item.setPresence(dto.getPresence());
            if (dto.getWhatsUpMessageSent() != null)
                item.setWhatsUpMessageSent(dto.getWhatsUpMessageSent());
            if (StringUtil.isNotEmpty(dto.getDateEnvoiwhatsUpMessage()))
                item.setDateEnvoiwhatsUpMessage(DateUtil.stringEnToDate(dto.getDateEnvoiwhatsUpMessage()));
            if (dto.getEmailMessageSent() != null)
                item.setEmailMessageSent(dto.getEmailMessageSent());
            if (StringUtil.isNotEmpty(dto.getDateEnvoiEmailMessage()))
                item.setDateEnvoiEmailMessage(DateUtil.stringEnToDate(dto.getDateEnvoiEmailMessage()));
            if (dto.getAbonne() != null)
                item.setAbonne(dto.getAbonne());
            if (dto.getFreeTrial() != null && dto.getFreeTrial().getId() != null) {
                item.setFreeTrial(new FreeTrial());
                item.getFreeTrial().setId(dto.getFreeTrial().getId());
            }

            if (this.student && dto.getStudent() != null)
                item.setStudent(studentConverter.toItem(dto.getStudent()));


            return item;
        }
    }

    @Override
    public FreeTrialDetailDto toDto(FreeTrialDetail item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialDetailDto dto = new FreeTrialDetailDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            dto.setPresence(item.getPresence());
            dto.setWhatsUpMessageSent(item.getWhatsUpMessageSent());
            if (item.getDateEnvoiwhatsUpMessage() != null)
                dto.setDateEnvoiwhatsUpMessage(DateUtil.dateTimeToString(item.getDateEnvoiwhatsUpMessage()));
            dto.setEmailMessageSent(item.getEmailMessageSent());
            if (item.getDateEnvoiEmailMessage() != null)
                dto.setDateEnvoiEmailMessage(DateUtil.dateTimeToString(item.getDateEnvoiEmailMessage()));
            dto.setAbonne(item.getAbonne());
            if (this.freeTrial && item.getFreeTrial() != null) {
                dto.setFreeTrial(freeTrialConverter.toDto(item.getFreeTrial()));
            }
            if (this.student && item.getStudent() != null) {
                dto.setStudent(studentConverter.toDto(item.getStudent()));
            }
            return dto;
        }
    }


    public void initObject(boolean value) {
        this.freeTrial = value;
        this.student = value;
    }


    public StudentConverter getStudentConverter() {
        return this.studentConverter;
    }

    public void setStudentConverter(StudentConverter studentConverter) {
        this.studentConverter = studentConverter;
    }

    public FreeTrialConverter getFreeTrialConverter() {
        return this.freeTrialConverter;
    }

    public void setFreeTrialConverter(FreeTrialConverter freeTrialConverter) {
        this.freeTrialConverter = freeTrialConverter;
    }


    public boolean isFreeTrial() {
        return this.freeTrial;
    }

    public void setFreeTrial(boolean freeTrial) {
        this.freeTrial = freeTrial;
    }

    public boolean isStudent() {
        return this.student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
}
