package com.example.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class primary extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView list;
    private SearchView search;
    String[] country;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
        list = findViewById(R.id.list);
        search = findViewById(R.id.search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        country = getResources().getStringArray(R.array.primary);

        adapter = new ArrayAdapter<String>(primary.this, R.layout.view, R.id.show, country);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {       //edit text er moto search box banaiya
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {    //onclickListener

        if (position == 0) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "dengue");
            startActivity(intent);
        } else if (position == 1) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "snake");
            startActivity(intent);

        } else if (position == 2) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "burn");
            startActivity(intent);
        } else if (position == 3) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "heart");
            startActivity(intent);
        } else if (position == 4) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "stroke");
            startActivity(intent);
        } else if (position == 5) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "breathing");
            startActivity(intent);
        } else if (position == 6) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "bone");
            startActivity(intent);
        } else if (position == 7) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "shock");
            startActivity(intent);
        } else if (position == 8) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "lblood");
            startActivity(intent);
        } else if (position == 9) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "hblood");
            startActivity(intent);
        } else if (position == 10) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "treatment");
            startActivity(intent);
        } else if (position == 11) {
            Intent intent = new Intent(getApplicationContext(), treatments.class);
            intent.putExtra("1", "cpr");
            startActivity(intent);
        }else return;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}