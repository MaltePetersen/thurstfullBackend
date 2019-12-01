package dhsh.app.thurstfull.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Sentence {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    private String name;
    @NotNull
    @OneToOne
    private QuestType questType;

    public Sentence(@NotBlank String name, @NotNull QuestType questType) {
        this.name = name;
        this.questType = questType;
    }

    public Sentence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestType getQuestType() {
        return questType;
    }

    public void setQuestType(QuestType questType) {
        this.questType = questType;
    }
}
