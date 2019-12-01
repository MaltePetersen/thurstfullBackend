package dhsh.app.thurstfull.dto;

import dhsh.app.thurstfull.domain.QuestType;

import javax.validation.constraints.NotBlank;

public class SentenceDto {
    @NotBlank
    private String name;
    @NotBlank
    private int questType;

    public SentenceDto(@NotBlank String name, @NotBlank int questType) {
        this.name = name;
        this.questType = questType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestType() {
        return questType;
    }

    public void setQuestType(int questType) {
        this.questType = questType;
    }
}

