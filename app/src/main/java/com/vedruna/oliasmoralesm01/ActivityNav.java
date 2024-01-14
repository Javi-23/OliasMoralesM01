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

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_Root);
        assert navHostFragment != null;
        NavController navController = navHostFragment.getNavController();

        // Obtén el nombre de usuario de la actividad anterior
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("nombreUsuario");
        Bundle args = new Bundle();
        args.putString("nombreUsuario", text);

        ContadorFragment contadorFragment = new ContadorFragment();
        contadorFragment.setArguments(args);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_contador) {
                navController.navigate(R.id.contadorFragment);
            } else {
                navController.navigate(R.id.exitFragment);
            }
            return true;
        });
    }
}