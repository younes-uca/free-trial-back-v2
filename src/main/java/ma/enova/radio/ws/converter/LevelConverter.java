package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Level;
import ma.enova.radio.bean.history.LevelHistory;
import ma.enova.radio.ws.dto.LevelDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class LevelConverter extends AbstractConverter<Level, LevelDto, LevelHistory> {


    public LevelConverter() {
        super(Level.class, LevelDto.class, LevelHistory.class);
    }

    @Override
    public Level toItem(LevelDto dto) {
        if (dto == null) {
            return null;
        } else {
            Level item = new Level();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


            return item;
        }
    }

    @Override
    public LevelDto toDto(Level item) {
        if (item == null) {
            return null;
        } else {
            LevelDto dto = new LevelDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
