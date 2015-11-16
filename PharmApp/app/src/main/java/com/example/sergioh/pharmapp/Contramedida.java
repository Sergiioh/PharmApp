package com.example.sergioh.pharmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Contramedida extends AppCompatActivity {

    TextView contramedida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contramedida);
        contramedida = (TextView)findViewById(R.id.textView);
        Bundle bundle =getIntent().getExtras();
        contramedida.setText(bundle.getString("contramedida"));


    }

}
