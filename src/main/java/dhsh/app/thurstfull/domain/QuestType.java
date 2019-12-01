package dhsh.app.thurstfull.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class QuestType {
    @Id
    @GeneratedValue
    private int id;
    @NotBlank
    private String category;

    public QuestType(@NotBlank String category) {
        this.category = category;
    }

    public QuestType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
