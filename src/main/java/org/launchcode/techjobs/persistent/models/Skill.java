package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Skills cannot be blank")
    @Size(max = 100, message = "Description must be no more than 100 characters")
    private String description;

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
