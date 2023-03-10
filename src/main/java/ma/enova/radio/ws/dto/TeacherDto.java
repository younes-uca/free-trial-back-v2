package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeacherDto extends AuditBaseDto {

    private String libelle;
    private String code;
    private String email;
    private String phone;


    public TeacherDto() {
        super();
    }


    @Log
    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Log
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Log
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Log
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
