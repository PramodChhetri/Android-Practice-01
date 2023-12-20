package com.example.mp_02_signupform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton btnr = (MaterialButton) findViewById(R.id.btnregister);
        MaterialButton btnl = (MaterialButton) findViewById(R.id.loginbtn);
        EditText etUsername = (EditText) findViewById(R.id.username);

        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( LoginActivity.this,secondactivity.class) ;
                intent.putExtra("Name",etUsername.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Setting is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.item2:
                Toast.makeText(this,"Logout is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.item3:
                Toast.makeText(this,"Aboutus is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.subitem1:
                Toast.makeText(this,"Accounts is selected", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.subitem2:
                Toast.makeText(this,"Device is selected", Toast.LENGTH_SHORT).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}