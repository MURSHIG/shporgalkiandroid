package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;




public class StepeniActivity extends AppCompatActivity {
//Инициализация кнопок
    EditText num1;
    EditText num2;
    TextView result;
//    Стандарт
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepeni);
        num1 = (EditText)findViewById(R.id.firstnum);
        num2 = (EditText)findViewById(R.id.secondnum);
        result = (TextView)findViewById(R.id.res);
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
           result.setText("Введите числа!");
    }
    public void onclickback(View view){
        Intent back = new Intent(StepeniActivity.this,MathActivity.class);
        startActivity(back);

    }
}