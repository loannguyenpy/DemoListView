package com.example.loan.listviewexample;

import java.io.Serializable;

/**
 * Created by LOAN on 7/13/2016.
 */
public class Tree implements Serializable {
    private int id;
    private String name;
    private String sub;
    private boolean prcess;
    public Tree(int i, String n, String s, boolean p)
    {
        this.id=i;
        this.name=n;
        this.sub=s;
        this.prcess=p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrcess(boolean prcess) {
        this.prcess = prcess;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public boolean isPrcess() {
        return prcess;
    }

    public String getSub() {
        return sub;
    }


}
