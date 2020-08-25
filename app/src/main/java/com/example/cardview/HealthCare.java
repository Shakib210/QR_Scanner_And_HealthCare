package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class HealthCare extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView list;
    private SearchView search;
    String[] country;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);
        list = findViewById(R.id.list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        country = getResources().getStringArray(R.array.care);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.view, R.id.show, country);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {    //onclickListener

         return;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
