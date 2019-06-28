package com.example.lbkomunitas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.net.Uri;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v4.app.Fragment;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.profile_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.profile_username);


// kita set default nya Home Fragment
        loadFragment(new ProfileGridFragment());
// inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.posts_layout_type_navigation);
// beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    // method listener untuk logika pemilihan
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.profile_nav_grid:
//fragment = new ProfileGridFragment();
                break;
            case R.id.profile_nav_linear:
//fragment = new ProfileLinearFragment();
                break;
        }
        return loadFragment(fragment);
    }

    // method untuk load fragment yang sesuai
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_cont, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}
