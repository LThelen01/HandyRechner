package com.example.handyrechner;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    



    //Deklaration

    TextView tvpreis;
    TextView tvmonate;
    EditText etpreis;
    EditText etmonate;
    Button btberechne;
    TextView tvgesamt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //verknüpfen


        tvmonate = findViewById(R.id.tvmonate);
        tvpreis = findViewById(R.id. tvpreis);
        etpreis = findViewById(R.id. etpreis);
        etmonate = findViewById(R.id.etmonate);
        btberechne = findViewById(R.id.btberechne);
        tvgesamt = findViewById(R.id.tvgesamt);

        //listener

        btberechne.setOnClickListener(View -> clickedButton());



    }

    private void clickedButton() {
        Toast.makeText(this,"Berechne",Toast.LENGTH_LONG).show();



    }


}
