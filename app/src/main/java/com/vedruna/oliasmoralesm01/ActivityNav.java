package com.vedruna.oliasmoralesm01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ActivityNav extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        // Obtiene una referencia al componente BottomNavigationView definido en activity_nav.xml
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        // Establece el elemento seleccionado por defecto en la barra de navegación inferior
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        // Obtiene el fragmento de host de navegación del contenedor definido en activity_nav.xml
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_Root);

        // Asegura que el fragmento de host de navegación no sea nulo
        assert navHostFragment != null;

        // Obtiene el controlador de navegación asociado al fragmento de host de navegación
        NavController navController = navHostFragment.getNavController();


        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("nombreUsuario");
        Bundle args = new Bundle();
        args.putString("nombreUsuario", text);

        ContadorFragment contadorFragment = new ContadorFragment();
        contadorFragment.setArguments(args);

        // Configura el listener para manejar los eventos de selección de elementos en la barra de navegación inferior
        bottomNavigationView.setOnItemSelectedListener(item -> {
            // Verifica el ID del elemento seleccionado y navega a la pantalla correspondiente utilizando el NavController
            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_contador) {
                navController.navigate(R.id.contadorFragment);
            } else {
                // En este caso, navega a un fragmento llamado exitFragment (puedes ajustar este nombre según tu configuración)
                navController.navigate(R.id.exitFragment);
            }

            // Devuelve true para indicar que el evento de selección ha sido manejado correctamente
            return true;
        });
    }
}