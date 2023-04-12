package com.example.practicatercerparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FirtstFragment firstFragment = new FirtstFragment();
    secondFragment secondFragment = new secondFragment();
    thirdFragment thirdFragment = new thirdFragment();
    //fourthFragment fragmentFourth = new fourthFragment();
    fourthFragment fourthFragment = new fourthFragment();
    //fifthFragment fifthFragment = new fifthFragment();
    fifthFragment fifthFragment = new fifthFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(firstFragment);

        // Barra de navegación superior
        BottomNavigationView topNavigation = findViewById(R.id.top_navigation);
        //topNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        topNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListenerTop);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.firtstFragment:
                    loadFragment(firstFragment);
                    return true;
                case R.id.secondFragment:
                    loadFragment(secondFragment);
                    return true;
                case R.id.thirdFragment:
                    loadFragment(thirdFragment);
                    return true;
            }
            return false;
        }
    };

    // Controlador de eventos para la barra de navegación superior
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListenerTop = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.firtstFragment:
                    loadFragment(firstFragment);
                    return true;
                case R.id.secondFragment:
                    loadFragment(secondFragment);
                    return true;
                case R.id.thirdFragment:
                    loadFragment(thirdFragment);
                    return true;
                case R.id.lugares:
                    loadFragment(fourthFragment);
                    return true;
                case R.id.notificaciones:
                    loadFragment(fifthFragment);
                    return true;
            }
            return false;
        }
    };

    public void loadFragment (Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.commit();
    }
}