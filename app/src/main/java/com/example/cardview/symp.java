package com.example.cardview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class symp extends AppCompatActivity {

    ExpandableListView expandableListView;
    HashMap<String, List<String>> listChild;
    List<String> listHeader;
    CustomAdapter customAdapter;
    private SearchView searchView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symp);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        expandableListView = (ExpandableListView) findViewById(R.id.list);
        searchView=findViewById(R.id.search);
        listChild = ExpandableListData.getData();
        listHeader = new ArrayList<String>(listChild.keySet());
        customAdapter = new CustomAdapter(this, listHeader, listChild);
        expandableListView.setAdapter(customAdapter);

       expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
           @Override
           public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

             if(i==0 && i1==2){
                 Toast.makeText(symp.this, "Macbook", Toast.LENGTH_SHORT).show();
             }


               return false;
           }
       });





    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

