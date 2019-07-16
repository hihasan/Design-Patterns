package com.hihasandesignpatterns.model;

public class AddSingleTonValue
{
    private static final int ADD_VALUE = 10;
    public int value;

    public int getValue()
    {
        return value;
    }

    public void addValue(){
        value+=ADD_VALUE;
    }
}
