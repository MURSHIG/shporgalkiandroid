package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.math.BigInteger;

public class MathActivity extends AppCompatActivity {
//   Инициализациря кнопок
    ImageButton back;
    Button fact;
    Button stepen;
//Стандарт
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Design_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        back = (ImageButton) findViewById(R.id.back);
        fact = (Button)findViewById(R.id.factorial);
        stepen  = (Button)findViewById(R.id.stepen);
        ;
    }
//    Переход на ФакториалАктивити
    public void onClickFact(View view) {
        Intent tofact = new Intent(MathActivity.this,FactorialActivity.class);
        startActivity(tofact);
        }






//Переход на СтепениАктивити

     //К степени
    public void onClickstep(View view) {
     Intent tostep = new Intent(MathActivity.this,StepeniActivity.class);
     startActivity(tostep);
    }//Назад
    public void onclickback(View view){
         Intent back = new Intent(MathActivity.this,MainActivity.class);
        startActivity(back);

    }



    }
