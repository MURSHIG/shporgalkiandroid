package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class StepeniActivity extends AppCompatActivity {
//Инициализация кнопок
    EditText num1;
    EditText num2;
    TextView result;
    Toast empty;
//    Стандарт
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Design_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepeni);
        num1 = (EditText)findViewById(R.id.firstnum);
        num2 = (EditText)findViewById(R.id.secondnum);
        result = (TextView)findViewById(R.id.res);
        empty = Toast.makeText(getApplicationContext(),"Введите оба числа!",Toast.LENGTH_LONG);
    }
//    Кнопка поиска степени
    public void findstepen(View view){
//       Если оба поля не пустые , то начинается поиск
        if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("")) {
           int n1 = Integer.parseInt(num1.getText().toString());
           int  n2 = Integer.parseInt(num2.getText().toString());
           int res = 1;
           for (int i=1;i<=n2;i++){
               res = res*n1;
           }
           result.setText(String.valueOf(res));

       }
       else
           empty.show();
    }
    public void onclickback(View view){
        Intent back = new Intent(StepeniActivity.this,MathActivity.class);
        startActivity(back);

    }
}