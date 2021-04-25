package com.example.tugas4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=======================
        /*
        recyclerView = findViewById(R.id.recyclerviewid);
        judul=getResources().getStringArray(R.array.judul);
        deskripsi=getResources().getStringArray(R.array.deskripsi);

        RV_Adapter rv_adapter = new RV_Adapter(this, judul, deskripsi, images);
        recyclerView.setAdapter(rv_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
*/

        //===============================


        navbar = findViewById(R.id.main_navbar);
        navbar.setOnNavigationItemSelectedListener(this);
        loadFragment(new Fragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_frame, fragment)
                    .commit();
            return true;

        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.ic_home:
                fragment=new Home();
                 break;
            case R.id.ic_list:
                fragment=new List();
                break;


        }

        return loadFragment(fragment);
    }

}