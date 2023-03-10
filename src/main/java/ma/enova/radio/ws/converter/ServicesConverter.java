package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Services;
import ma.enova.radio.bean.history.ServicesHistory;
import ma.enova.radio.ws.dto.ServicesDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class ServicesConverter extends AbstractConverter<Services, ServicesDto, ServicesHistory> {


    public ServicesConverter() {
        super(Services.class, ServicesDto.class, ServicesHistory.class);
    }

    @Override
    public Services toItem(ServicesDto dto) {
        if (dto == null) {
            return null;
        } else {
            Services item = new Services();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


            return item;
        }
    }

    @Override
    public ServicesDto toDto(Services item) {
        if (item == null) {
            return null;
        } else {
            ServicesDto dto = new ServicesDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
