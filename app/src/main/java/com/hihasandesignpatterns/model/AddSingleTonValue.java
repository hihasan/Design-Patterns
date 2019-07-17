package com.hihasandesignpatterns.model;

public class AddSingleTonValue
{
    private static final int ADD_VALUE = 10;
    public int value;

    //Singleton here

    private static AddSingleTonValue instance;

    private AddSingleTonValue(){
        //private to prevent other create instantiating
    }

    public static AddSingleTonValue getInstance(){
        if (instance ==null){
            instance=new AddSingleTonValue();
        }

        return instance;
    }

    public int getValue()
    {
        return value;
    }

    public void addValue(){
        value+=ADD_VALUE;
    }
}
