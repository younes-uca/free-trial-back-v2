package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "free_trial_configuration")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "free_trial_configuration_seq", sequenceName = "free_trial_configuration_seq", allocationSize = 1, initialValue = 1)
public class FreeTrialConfiguration extends AuditBusinessObject {

    private Long id;

    private LocalDateTime dateApplicationDebut;
    private LocalDateTime dateApplicationFin;
    private Integer nombreStudentMax = 0;
    private Integer nombreStudentMin = 0;


    public FreeTrialConfiguration() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "free_trial_configuration_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateApplicationDebut() {
        return this.dateApplicationDebut;
    }

    public void setDateApplicationDebut(LocalDateTime dateApplicationDebut) {
        this.dateApplicationDebut = dateApplicationDebut;
    }

    public LocalDateTime getDateApplicationFin() {
        return this.dateApplicationFin;
    }

    public void setDateApplicationFin(LocalDateTime dateApplicationFin) {
        this.dateApplicationFin = dateApplicationFin;
    }

    public Integer getNombreStudentMax() {
        return this.nombreStudentMax;
    }

    public void setNombreStudentMax(Integer nombreStudentMax) {
        this.nombreStudentMax = nombreStudentMax;
    }

    public Integer getNombreStudentMin() {
        return this.nombreStudentMin;
    }

    public void setNombreStudentMin(Integer nombreStudentMin) {
        this.nombreStudentMin = nombreStudentMin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeTrialConfiguration freeTrialConfiguration = (FreeTrialConfiguration) o;
        return id != null && id.equals(freeTrialConfiguration.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

