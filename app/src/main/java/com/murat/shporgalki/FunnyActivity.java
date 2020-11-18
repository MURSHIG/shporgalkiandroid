package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class FunnyActivity extends AppCompatActivity {
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Design_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);
    }

    public void Polizei(View view) {
     Intent polizei = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2Mv25IUI0RU"));
     startActivity(polizei);
    }
    public void back (View view){
        Intent back = new Intent(FunnyActivity.this,MainActivity.class);
        startActivity(back);
    }
    public void pumpedkicks(View view){
        Intent kicks = new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/bjwgt1kRqEU?t=144"));
        startActivity(kicks);
    }
    public void odlechet(View view) {
        Intent odlechet = new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/Y1s_WAxNCCw"));
        startActivity(odlechet);
    }
    public void levapolka(View view){
        Intent leva = new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/vs1mXnWuHd8"));
        startActivity(leva);
    }
}