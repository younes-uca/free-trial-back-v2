package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "level")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "level_seq", sequenceName = "level_seq", allocationSize = 1, initialValue = 1)
public class Level extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;


    public Level() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level_seq")
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

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return id != null && id.equals(level.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

