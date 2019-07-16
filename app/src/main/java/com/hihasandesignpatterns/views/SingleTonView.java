package com.hihasandesignpatterns.views;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import com.hihasandesignpatterns.R;
import com.hihasandesignpatterns.model.AddSingleTonValue;

import java.util.Locale;

public class SingleTonView extends AppCompatActivity
{
    AppCompatTextView txt;
    AddSingleTonValue add;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        add=new AddSingleTonValue();

        txt=(AppCompatTextView) findViewById (R.id.number);

        updateUi();

    }

    private void updateUi()
    {
        String msg= String.format(Locale.getDefault(),"Value %d",add.getValue());
        txt.setText(msg);
    }
}
