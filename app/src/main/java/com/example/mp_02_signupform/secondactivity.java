package com.example.mp_02_signupform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        MaterialButton btnreturn = (MaterialButton) findViewById(R.id.btnreturn);
        registerForContextMenu(btnreturn);
        MaterialButton btnpopup = (MaterialButton) findViewById(R.id.btnpopup);
        TextView txt1 = (TextView) findViewById(R.id.hiuser);
        txt1.setText(getIntent().getStringExtra("Name"));

        btnpopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(secondactivity.this, view);
                popup.inflate(R.menu.menu3);
                popup.show();
            }
        });

    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater cinflater = getMenuInflater();
        cinflater.inflate(R.menu.menu2, menu);


    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.citem1:
                Toast.makeText(this, "Setting is selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.citem2:
                Toast.makeText(this, "Logout is selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }




}
