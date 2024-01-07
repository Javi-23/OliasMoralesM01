package com.vedruna.oliasmoralesm01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity2 extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextContrasenha;
    private TextView mensajeError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        editTextUsuario = findViewById(R.id.TextUsuario);
        editTextContrasenha = findViewById(R.id.TextContrasenha);
        mensajeError = findViewById(R.id.textUser);
    }

    public void login(View view) {
        String usuario = editTextUsuario.getText().toString();
        String contraseña = editTextContrasenha.getText().toString();

        if (usuario.equals("admin") && contraseña.equals("admin")) {
            mensajeError.setVisibility(View.VISIBLE);
            mensajeError.setText("Login Correcto");
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("nombreUsuario", usuario);
            startActivity(intent);
            finish();

        } else {
            mensajeError.setVisibility(View.VISIBLE);
            mensajeError.setText("Usuario o contraseña incorrectos");
        }
    }
}