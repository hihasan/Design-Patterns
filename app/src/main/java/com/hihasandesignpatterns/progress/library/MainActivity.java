package com.hihasandesignpatterns.progress.library;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.hihasandesignpatterns.R;
import com.hihasandesignpatterns.progress.library.SpotsDialog;

public class MainActivity extends AppCompatActivity
{
    AppCompatButton btn;
    private Context context=this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        btn=(AppCompatButton) findViewById (R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SpotsDialog.Builder()
                        .setTheme(R.style.Custom)
                        .setMessage(R.string.app_name)
                        .build()
                        .show();

            }
        });
    }
}
