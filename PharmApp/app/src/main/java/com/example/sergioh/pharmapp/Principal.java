package com.example.sergioh.pharmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class Principal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



    }

    public void NexPage(View view){

        Intent i = new Intent(this, BuscarMedicamento.class);
        startActivity(i);
    }
}
