package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button mathem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathem = (Button)findViewById(R.id.math);

    }

    public void mathclick(View v) {
        Intent math = new Intent(MainActivity.this,MathActivity.class);
        startActivity(math);

    }
    public void chimclick(View view){
        Intent chim = new Intent(MainActivity.this,ChimActivity.class);
        startActivity(chim);
    }
    public void InfoClick(View view){
        Intent info = new Intent(MainActivity.this,InformatikaActivity.class);
        startActivity(info);
    }
}