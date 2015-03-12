package com.github.stokito.command;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

@Validated
public class AddConferenceCommand {
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
