package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;


public class FreeTrialStudentEmailTemplateCriteria extends BaseCriteria {

    private String object;
    private String objectLike;
    private String source;
    private String sourceLike;


    public FreeTrialStudentEmailTemplateCriteria() {
    }

    public String getObject() {
        return this.object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObjectLike() {
        return this.objectLike;
    }

    public void setObjectLike(String objectLike) {
        this.objectLike = objectLike;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceLike() {
        return this.sourceLike;
    }

    public void setSourceLike(String sourceLike) {
        this.sourceLike = sourceLike;
    }


}
