package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Student;
import ma.enova.radio.bean.history.StudentHistory;
import ma.enova.radio.ws.dto.StudentDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter extends AbstractConverter<Student, StudentDto, StudentHistory> {


    public StudentConverter() {
        super(Student.class, StudentDto.class, StudentHistory.class);
    }

    @Override
    public Student toItem(StudentDto dto) {
        if (dto == null) {
            return null;
        } else {
            Student item = new Student();
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
    public StudentDto toDto(Student item) {
        if (item == null) {
            return null;
        } else {
            StudentDto dto = new StudentDto();
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
