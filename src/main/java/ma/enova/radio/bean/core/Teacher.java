package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "teacher_seq", sequenceName = "teacher_seq", allocationSize = 1, initialValue = 1)
public class Teacher extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String phone;


    public Teacher() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq")
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        Teacher teacher = (Teacher) o;
        return id != null && id.equals(teacher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

