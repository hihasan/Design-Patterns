package com.hihasandesignpatterns.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainModel
{
    @SerializedName("name")
    public String name;
    @SerializedName("realname")
    public String realname;
    @SerializedName("createdby")
    public String createdby;
    @SerializedName("imageurl")
    public String img;

    public MainModel(String name, String realname, String createdby, String img) {
        this.name = name;
        this.realname = realname;
        this.createdby = createdby;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getImg() {
        return img;
    }
}
