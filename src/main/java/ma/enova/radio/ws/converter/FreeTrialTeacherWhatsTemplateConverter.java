package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.enova.radio.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.enova.radio.ws.dto.FreeTrialTeacherWhatsTemplateDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class FreeTrialTeacherWhatsTemplateConverter extends AbstractConverter<FreeTrialTeacherWhatsTemplate, FreeTrialTeacherWhatsTemplateDto, FreeTrialTeacherWhatsTemplateHistory> {


    public FreeTrialTeacherWhatsTemplateConverter() {
        super(FreeTrialTeacherWhatsTemplate.class, FreeTrialTeacherWhatsTemplateDto.class, FreeTrialTeacherWhatsTemplateHistory.class);
    }

    @Override
    public FreeTrialTeacherWhatsTemplate toItem(FreeTrialTeacherWhatsTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
            FreeTrialTeacherWhatsTemplate item = new FreeTrialTeacherWhatsTemplate();
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
    public FreeTrialTeacherWhatsTemplateDto toDto(FreeTrialTeacherWhatsTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialTeacherWhatsTemplateDto dto = new FreeTrialTeacherWhatsTemplateDto();
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
