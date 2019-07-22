package com.hihasandesignpatterns.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainModel
{
    @SerializedName("login")
    @Expose
    public String name;

    @SerializedName("avatar_url")
    @Expose
    public int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
