package com.hihasandesignpatterns.model;

public class MainModel
{
    public String name;
    public int img;

    public MainModel(String name, int img){
        this.name=name;
        this.img=img;
    }

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
