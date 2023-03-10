package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreeTrialDetailDto extends AuditBaseDto {

    private Boolean presence;
    private Boolean whatsUpMessageSent;
    private String dateEnvoiwhatsUpMessage;
    private Boolean emailMessageSent;
    private String dateEnvoiEmailMessage;
    private Boolean abonne;

    private FreeTrialDto freeTrial;
    private StudentDto student;


    public FreeTrialDetailDto() {
        super();
    }


    @Log
    public Boolean getPresence() {
        return this.presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    @Log
    public Boolean getWhatsUpMessageSent() {
        return this.whatsUpMessageSent;
    }

    public void setWhatsUpMessageSent(Boolean whatsUpMessageSent) {
        this.whatsUpMessageSent = whatsUpMessageSent;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEnvoiwhatsUpMessage() {
        return this.dateEnvoiwhatsUpMessage;
    }

    public void setDateEnvoiwhatsUpMessage(String dateEnvoiwhatsUpMessage) {
        this.dateEnvoiwhatsUpMessage = dateEnvoiwhatsUpMessage;
    }

    @Log
    public Boolean getEmailMessageSent() {
        return this.emailMessageSent;
    }

    public void setEmailMessageSent(Boolean emailMessageSent) {
        this.emailMessageSent = emailMessageSent;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateEnvoiEmailMessage() {
        return this.dateEnvoiEmailMessage;
    }

    public void setDateEnvoiEmailMessage(String dateEnvoiEmailMessage) {
        this.dateEnvoiEmailMessage = dateEnvoiEmailMessage;
    }

    @Log
    public Boolean getAbonne() {
        return this.abonne;
    }

    public void setAbonne(Boolean abonne) {
        this.abonne = abonne;
    }


    public FreeTrialDto getFreeTrial() {
        return this.freeTrial;
    }

    public void setFreeTrial(FreeTrialDto freeTrial) {
        this.freeTrial = freeTrial;
    }

    public StudentDto getStudent() {
        return this.student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }


}
