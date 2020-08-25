package com.example.cardview;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CardView scan,primary,symptoms,tips;
    private AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     scan=findViewById(R.id.scan);
     primary=findViewById(R.id.primary);
     symptoms=findViewById(R.id.symptoms);
    tips=findViewById(R.id.tips);


      scan.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(getApplicationContext(),ScannedBarcode.class);
              startActivity(intent);
          }
      });
        primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),primary.class);
                startActivity(intent);
            }
        });

        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),symp.class);
                startActivity(intent);
            }
        });

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HealthCare.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.about){
            Intent intent=new Intent(MainActivity.this,about.class);
            startActivity(intent);
        }else if(item.getItemId()==R.id.share){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject="healthcare app";
            String body="It will help you to maintain your health- www.google.com";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share with"));

        }else {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }






    @Override
    public void onBackPressed() {
        builder= new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Warning");
        builder.setMessage("Want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();


    }

}
