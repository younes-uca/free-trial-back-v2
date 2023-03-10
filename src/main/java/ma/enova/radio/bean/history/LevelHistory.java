package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "level")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "level_seq", sequenceName = "level_seq", allocationSize = 1, initialValue = 1)
public class LevelHistory extends HistBusinessObject {


    public LevelHistory() {
        super();
    }

    public LevelHistory(Long id) {
        super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level_seq")
    public Long getId() {
        return id;
    }
}

