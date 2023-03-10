package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "statut_free_trial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "statut_free_trial_seq", sequenceName = "statut_free_trial_seq", allocationSize = 1, initialValue = 1)
public class StatutFreeTrial extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String style;


    public StatutFreeTrial() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "statut_free_trial_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatutFreeTrial statutFreeTrial = (StatutFreeTrial) o;
        return id != null && id.equals(statutFreeTrial.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

