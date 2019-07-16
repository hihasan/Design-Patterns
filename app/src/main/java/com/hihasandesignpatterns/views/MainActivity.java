package com.hihasandesignpatterns.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hihasandesignpatterns.R;
import com.hihasandesignpatterns.model.AddSingleTonValue;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    AppCompatButton value;
    AppCompatTextView value_txt;
    AddSingleTonValue add;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        value=(AppCompatButton) findViewById (R.id.value);

        add=new AddSingleTonValue();

        FloatingActionButton fab=(FloatingActionButton) findViewById (R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Action Required", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this, SingleTonView.class);
                startActivity(i);
            }
        });

        btnAction();


    }

    private void btnAction()
    {
        value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.addValue();
                updateUi();
            }
        });
    }

    private void updateUi()
    {
        value_txt=(AppCompatTextView) findViewById (R.id.txt);
        String msg= String.format(Locale.getDefault(),"Value %d",add.getValue());
        value_txt.setText(msg);
    }
}
