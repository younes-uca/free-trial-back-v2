package ma.enova.radio.bean.core;

public class EmailDetails {
    private String from;
    private String to;
    private String cc;

    private String objet;
    private String corps;
    private String attachment;


    public EmailDetails() {
    }

    public EmailDetails(String from, String to, String cc, String objet, String corps, String attachment) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.objet = objet;
        this.corps = corps;
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
