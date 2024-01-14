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

        // Obtener referencias a los elementos de la interfaz de usuario
        editTextUsuario = findViewById(R.id.TextUsuario);
        editTextContrasenha = findViewById(R.id.TextContrasenha);
        mensajeError = findViewById(R.id.textUser);
    }

    public void login(View view) {
        // Obtener el texto ingresado en los campos de usuario y contraseña
        String usuario = editTextUsuario.getText().toString();
        String contrasenha = editTextContrasenha.getText().toString();

        // Verificar si el usuario y la contraseña coinciden con un valor predeterminado
        if (usuario.equals("admin") && contrasenha.equals("admin")) {


            // Mostrar mensaje de login correcto
            mensajeError.setVisibility(View.VISIBLE);
            mensajeError.setText("Login Correcto");

            // Crear un intent para pasar a la actividad principal (MainActivity)
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this, ActivityNav.class);
            intent.putExtra("nombreUsuario", usuario);
            bundle.putString("nombreUsuario", usuario);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        } else {
            // Mostrar mensaje de usuario o contraseña incorrectos
            mensajeError.setVisibility(View.VISIBLE);
            mensajeError.setText("Usuario o contraseña incorrectos");
        }
    }
}