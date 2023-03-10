package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreeTrialStudentWhatsTemplateDto extends AuditBaseDto {

    private String object;
    private String corps;
    private String source;


    public FreeTrialStudentWhatsTemplateDto() {
        super();
    }


    @Log
    public String getObject() {
        return this.object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Log
    public String getCorps() {
        return this.corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    @Log
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}
