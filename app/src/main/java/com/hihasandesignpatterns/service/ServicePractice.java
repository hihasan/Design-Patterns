package com.hihasandesignpatterns.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import com.hihasandesignpatterns.util.Utils;

public class ServicePractice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Utils.Toast(getApplicationContext(),"Service Created");
        //super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Utils.Toast(getApplicationContext(),"Service Started");
        //super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        Utils.Toast(getApplicationContext(),"Service Stoped");
        //super.onDestroy();
    }
}
