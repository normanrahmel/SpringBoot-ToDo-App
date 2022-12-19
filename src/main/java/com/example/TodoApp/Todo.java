package com.example.TodoApp;

public class Todo {
    private String title;
    private String description;
    private boolean isDone;
    private Integer id;

    public Todo() {
    }

    public Todo(String title, String description, boolean isDone, Integer id) {
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.id = id;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
