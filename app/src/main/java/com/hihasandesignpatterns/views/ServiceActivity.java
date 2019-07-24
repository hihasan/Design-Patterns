package com.hihasandesignpatterns.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.hihasandesignpatterns.R;
import com.hihasandesignpatterns.service.ServicePractice;

public class ServiceActivity extends AppCompatActivity
{
    AppCompatButton start,stop;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        start=(AppCompatButton) findViewById (R.id.start);
        stop=(AppCompatButton) findViewById (R.id.stop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(ServiceActivity.this,ServicePractice.class));
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),ServicePractice.class));
            }
        });
    }
}
