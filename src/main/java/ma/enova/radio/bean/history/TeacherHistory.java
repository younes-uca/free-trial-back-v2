package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "teacher_seq", sequenceName = "teacher_seq", allocationSize = 1, initialValue = 1)
public class TeacherHistory extends HistBusinessObject {


    public TeacherHistory() {
        super();
    }

    public TeacherHistory(Long id) {
        super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq")
    public Long getId() {
        return id;
    }
}

