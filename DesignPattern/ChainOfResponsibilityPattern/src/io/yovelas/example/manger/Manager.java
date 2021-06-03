package io.yovelas.example.manger;

import io.yovelas.example.manger.entity.Request;

public abstract class Manager {

    protected String name;
    protected Manager manage;

    public Manager(String name) {
        this.name = name;
    }

    public void setManage(Manager manage) {
        this.manage = manage;
    }

    abstract void requestManager(Request request);
}
