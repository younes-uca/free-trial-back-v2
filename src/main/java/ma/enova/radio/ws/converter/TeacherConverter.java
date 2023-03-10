package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Teacher;
import ma.enova.radio.bean.history.TeacherHistory;
import ma.enova.radio.ws.dto.TeacherDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TeacherConverter extends AbstractConverter<Teacher, TeacherDto, TeacherHistory> {


    public TeacherConverter() {
        super(Teacher.class, TeacherDto.class, TeacherHistory.class);
    }

    @Override
    public Teacher toItem(TeacherDto dto) {
        if (dto == null) {
            return null;
        } else {
            Teacher item = new Teacher();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if (StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if (StringUtil.isNotEmpty(dto.getPhone()))
                item.setPhone(dto.getPhone());


            return item;
        }
    }

    @Override
    public TeacherDto toDto(Teacher item) {
        if (item == null) {
            return null;
        } else {
            TeacherDto dto = new TeacherDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if (StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if (StringUtil.isNotEmpty(item.getPhone()))
                dto.setPhone(item.getPhone());
            return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
