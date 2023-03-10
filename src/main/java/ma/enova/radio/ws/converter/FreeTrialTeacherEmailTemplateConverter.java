package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.FreeTrialTeacherEmailTemplate;
import ma.enova.radio.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.enova.radio.ws.dto.FreeTrialTeacherEmailTemplateDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class FreeTrialTeacherEmailTemplateConverter extends AbstractConverter<FreeTrialTeacherEmailTemplate, FreeTrialTeacherEmailTemplateDto, FreeTrialTeacherEmailTemplateHistory> {


    public FreeTrialTeacherEmailTemplateConverter() {
        super(FreeTrialTeacherEmailTemplate.class, FreeTrialTeacherEmailTemplateDto.class, FreeTrialTeacherEmailTemplateHistory.class);
    }

    @Override
    public FreeTrialTeacherEmailTemplate toItem(FreeTrialTeacherEmailTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
            FreeTrialTeacherEmailTemplate item = new FreeTrialTeacherEmailTemplate();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getObject()))
                item.setObject(dto.getObject());
            if (StringUtil.isNotEmpty(dto.getCorps()))
                item.setCorps(dto.getCorps());
            if (StringUtil.isNotEmpty(dto.getSource()))
                item.setSource(dto.getSource());


            return item;
        }
    }

    @Override
    public FreeTrialTeacherEmailTemplateDto toDto(FreeTrialTeacherEmailTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialTeacherEmailTemplateDto dto = new FreeTrialTeacherEmailTemplateDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getObject()))
                dto.setObject(item.getObject());
            if (StringUtil.isNotEmpty(item.getCorps()))
                dto.setCorps(item.getCorps());
            if (StringUtil.isNotEmpty(item.getSource()))
                dto.setSource(item.getSource());
            return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
