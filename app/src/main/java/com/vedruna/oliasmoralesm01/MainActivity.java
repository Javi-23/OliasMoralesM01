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

        // Obtener referencia al TextView que mostrará el nombre de usuario
        TextView textUser = findViewById(R.id.textUser);

        // Obtener el intent que inició esta actividad
        Intent intent = getIntent();

        // Verificar si el intent no es nulo
        if (intent != null) {
            // Obtener el nombre de usuario del intent
            String nombreUsuario = intent.getStringExtra("nombreUsuario");

            // Verificar si el nombre de usuario no es nulo
            if (nombreUsuario != null) {
                // Establecer el nombre de usuario en el TextView
                textUser.setText(nombreUsuario);

            }
        }
    }
}