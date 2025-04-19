package com.example.myproject;

import jakarta.validation.constraints.NotBlank;

public class TaskDTO {

    @NotBlank(message = "Title is mandatory")
    private String title;

    private String description;

    private String status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
