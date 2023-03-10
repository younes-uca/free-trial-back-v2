package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;


public class StudentCriteria extends BaseCriteria {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;
    private String email;
    private String emailLike;
    private String phone;
    private String phoneLike;


    public StudentCriteria() {
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleLike() {
        return this.libelleLike;
    }

    public void setLibelleLike(String libelleLike) {
        this.libelleLike = libelleLike;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return this.codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailLike() {
        return this.emailLike;
    }

    public void setEmailLike(String emailLike) {
        this.emailLike = emailLike;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneLike() {
        return this.phoneLike;
    }

    public void setPhoneLike(String phoneLike) {
        this.phoneLike = phoneLike;
    }


}
