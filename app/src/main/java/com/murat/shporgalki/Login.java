package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
//   Обозначение полей
    EditText pass;  //Поле с паролем
    TextView textView;
//   Стадарт
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        pass = (EditText)findViewById(R.id.Password);
        textView = (TextView)findViewById(R.id.textView2);

    }
//    Нажатие на кнопку входа
    public void signing (View view){
      if (pass.getText().toString().equals("1999" /*Если пароль будет 1999 то запустится MainActivity*/)){
         Intent sign = new Intent(Login.this,MainActivity.class);
         startActivity(sign);
      }
      else{
          textView.setText("Неправильный пароль!");
      }

    }
}