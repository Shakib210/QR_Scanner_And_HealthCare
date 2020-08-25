package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class treatments extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatments);
        textView=findViewById(R.id.text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String value=bundle.getString("1");

            if(value.equals("dengue")){
                textView.setText(getResources().getString(R.string.dengue));

            }else if(value.equals("snake")){
                textView.setText(getResources().getString(R.string.snake));
            }else if(value.equals("burn")){
                textView.setText(getResources().getString(R.string.burns));
            }else if(value.equals("heart")){
                textView.setText(getResources().getString(R.string.heart));

            }else if(value.equals("stroke")){
                textView.setText(getResources().getString(R.string.stroke));

            }else if(value.equals("breathing")){
                textView.setText(getResources().getString(R.string.breathing));
            }else if(value.equals("bone")){
                textView.setText(getResources().getString(R.string.bones));

            }else if(value.equals("shock")){
                textView.setText(getResources().getString(R.string.shock));

            }else if(value.equals("lblood")){
                textView.setText(getResources().getString(R.string.lblood));

            }else  if(value.equals("hblood")){
                textView.setText(getResources().getString(R.string.hblood));
            }else  if(value.equals("treatment")){
                textView.setText(getResources().getString(R.string.treatment));
            }else  if(value.equals("cpr")){
                textView.setText(getResources().getString(R.string.cpr));
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
