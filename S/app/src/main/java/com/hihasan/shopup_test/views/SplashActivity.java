package com.hihasan.shopup_test.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hihasan.shopup_test.R;
import com.hihasan.shopup_test.utils.Constants;
import com.hihasan.shopup_test.utils.Utils;

public class SplashActivity extends AppCompatActivity
{
    private Context context=this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        
        //Thread Handler for 5 sec.
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ConStatus();
            }
        }, Constants.APP_LOAD_TIME);
    }

    private void ConStatus() {
        if (Utils.isOnline(context)==true){
            //Toaster.makeText(getApplicationContext(),"You Are Online", Toaster.INFO,true);
            Toast.makeText(getApplicationContext(),"Online!!",Toast.LENGTH_SHORT).show();
            final Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            SplashActivity.this.finish();
        }

        else {
            //Toaster.makeText(getApplicationContext(),"You Are Offline", Toaster.INFO,true);
            Toast.makeText(getApplicationContext(),"Offline!!",Toast.LENGTH_SHORT).show();
            final Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
            SplashActivity.this.startActivity(mainIntent);
            SplashActivity.this.finish();

        }
    }
}
