package com.orange.toolz.models;

public class UserResult {

    private int id;
    private String list;

    public UserResult() {
    }

    public UserResult(int id, String list) {
        this.id = id;
        this.list = list;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getList() {
        return this.list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
