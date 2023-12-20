package com.example.mp_02_signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sharemessage extends AppCompatActivity {

    Button btnclear, btnshare;
    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharemessage);


        btnclear = (Button) findViewById(R.id.btnclear);
        btnshare = (Button) findViewById(R.id.btnshare);
        txt1 = (EditText) findViewById(R.id.txt1);

        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, txt1.getText().toString());
                i.setType(("text/plain"));
                startActivity(i);
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("");
            }
        });

    }
}