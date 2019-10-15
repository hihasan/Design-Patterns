package com.hihasandesignpatterns.util;

import android.content.Context;
import android.widget.Toast;

public class Utils
{
    public static void Toast(Context context, String m){
        Toast.makeText(context,m,Toast.LENGTH_SHORT).show();
    }
}
