package com.vedruna.oliasmoralesm01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textUser = findViewById(R.id.textUser);
        Intent intent = getIntent();
        if (intent != null) {
            String nombreUsuario = intent.getStringExtra("nombreUsuario");
            if (nombreUsuario != null) {
                textUser.setText(nombreUsuario);
            }
        }
    }
}