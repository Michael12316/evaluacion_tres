package com.michael_leal.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button idagregarsensor, idmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idagregarsensor= (Button) findViewById(R.id.idagregarsensor);
        idagregarsensor.setOnClickListener(this);
        idmapa= (Button)  findViewById(R.id.idmapa);
        idmapa.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.idagregarsensor:
                Intent agregarsensorIntent= new Intent(this ,Agregarsensor.class);
                startActivity(agregarsensorIntent);
                break;
            case R.id.idmapa:
                Intent mapactivityIntent= new Intent(this, MapsActivity.class);
                startActivity(mapactivityIntent);
                break;
        }


    }




}