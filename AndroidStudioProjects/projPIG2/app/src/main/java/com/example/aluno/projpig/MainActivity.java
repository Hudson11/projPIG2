package com.example.aluno.projpig;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt_matriz, bt_ambiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_matriz = findViewById(R.id.bt_matriz);
        bt_matriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

        bt_ambiente = findViewById(R.id.bt_ambiente);
        bt_ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AmbienteActivity.class));
            }
        });
    }

    public void click1(View v){
        Intent t = new Intent(this, AmbienteActivity.class);
        startActivity(t);
    }

    public void click2(View v){
        Intent t = new Intent(this, BaiasActivity.class);
        startActivity(t);
    }
}
