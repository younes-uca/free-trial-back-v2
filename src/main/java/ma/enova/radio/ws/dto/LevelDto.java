package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LevelDto extends AuditBaseDto {

    private String libelle;
    private String code;


    public LevelDto() {
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


}
