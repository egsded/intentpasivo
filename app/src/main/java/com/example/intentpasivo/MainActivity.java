package com.example.intentpasivo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String t=getIntent().getStringExtra("Mensaje");
        textv = findViewById(R.id.txtTexto);
        if(t !=null){
            textv.setText(t);
        }
    }
}
