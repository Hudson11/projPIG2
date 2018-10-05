package com.example.aluno.projpig;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class BaiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baias);

        /*LinearLayout bt_test = findViewById(R.id.bt_baia1);
        bt_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(BaiasActivity.this);
                dialog.setContentView(R.layout.layout_baia);
                dialog.setTitle("Alert Dialog View");

                TextView textView = (TextView) dialog.findViewById(R.id.custom_text_view);
                textView.setText("Alert Dialog view : imageView+textView+Button");

                Button btnExit = (Button) dialog.findViewById(R.id.btnExit);
                btnExit.setOnClickListener(new View.OnClickListener() {
                    @Override public void onClick(View v) {
                        Intent t = new Intent(BaiasActivity.this, TimeLineActivity.class);
                        startActivity(t);
                    }
                });
                // show dialog on screen
                dialog.show();
            }
        });*/

        ImageView teste = findViewById(R.id.buttonPig);
        teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BaiasActivity.this, TimeLineActivity.class));
            }
        });
    }

}
