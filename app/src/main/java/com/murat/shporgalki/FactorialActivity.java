package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

public class FactorialActivity extends AppCompatActivity {
//    Обозачаю кнопки
    EditText number;
    TextView text;
//Стандарт
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
//        Текстовые поля
        number = (EditText) findViewById(R.id.Number);
        text = (TextView) findViewById(R.id.Text);
    }
//Назад
    public void onclickback(View view) {
        Intent back = new Intent(FactorialActivity.this, MathActivity.class);
        startActivity(back);

    }
//Нажатие на кнопку
    public void Onclickfind(View view) {
//       Если поле не пустое начинается поиск
        if (!number.getText().toString().equals("")) {
           //Факториал
           int n1 = Integer.parseInt(number.getText().toString());
           BigInteger result = BigInteger.ONE;
           for (int i = 1; i <= n1; i++) {
               result = result.multiply(BigInteger.valueOf(i));

           }
           text.setText(String.valueOf(result));
       }
       else
            Toast.makeText(getApplicationContext(),"Введите число!",Toast.LENGTH_SHORT).show();
    }
}