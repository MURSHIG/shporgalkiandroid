package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class InformatikaActivity extends AppCompatActivity {

    EditText number;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatika);
        number = (EditText) findViewById(R.id.Numberinfo);
        res = (TextView) findViewById(R.id.resinfo);
    }

    //    Назад
    public void onclickbackinfo(View view) {
        Intent back = new Intent(InformatikaActivity.this, MainActivity.class);
        startActivity(back);
    }

    //    10к2
    public void onClicktento2(View view) {
        if (!number.getText().toString().equals(""))
            res.setText(Integer.toBinaryString(Integer.parseInt(number.getText().toString())));
    }

    // 10к8
    public void onClicktento8(View view) {
        if (!number.getText().toString().equals(""))
            res.setText(Integer.toOctalString(Integer.parseInt(number.getText().toString())));
    }

    // 10к16
    public void onClicktento16(View view) {
        if (!number.getText().toString().equals(""))
            res.setText(Integer.toHexString(Integer.parseInt(number.getText().toString())));
    }

    // 2к10
    public void onClicktwoto10(View view) {
        if (!number.getText().toString().equals(""))
            res.setText(String.valueOf(Integer.parseInt(number.getText().toString(), 2)));
    }

    // 2к8
    public void onClicktwoto8(View view) {
        if(!number.getText().toString().equals("")) {
        String bin = number.getText().toString();
        String oct = Integer.toOctalString(Integer.parseInt(bin, 8));
        res.setText(oct);
    }

}
    // 2к16
    public void onClicktwoto16(View view) {
        if(!number.getText().toString().equals("")) {
        String bin = number.getText().toString();
        String Hex = Integer.toHexString(Integer.parseInt(bin, 2));
        res.setText(Hex);
    }

}
    // 16к2
    public void onClick16to2(View view) {
        if (!number.getText().toString().equals("")) {
            String Hex = number.getText().toString();
            BigInteger bin = BigInteger.valueOf(Long.parseLong(Integer.toBinaryString(Integer.parseInt(Hex, 16))));
        }
    }
    // 16к8
    public void onClick16to8(View view) {
        if(!number.getText().toString().equals("")) {
        String Hex = number.getText().toString();
        String oct = Integer.toOctalString(Integer.parseInt(Hex, 16));
        res.setText(oct);
    }
    }

    // 16к10
    public void onClick16to10(View view) {
        if (!number.getText().toString().equals(""))
            res.setText(String.valueOf(Integer.parseInt(number.getText().toString(), 16)));
    }

    // 8к16
    public void onClick8to16(View view) {
        if(!number.getText().toString().equals("")) {
        String oct = number.getText().toString();
        String Hex = Integer.toHexString(Integer.parseInt(oct, 16));
    }

}
//   8к2
    public void onClick8to2(View view){
      if(!number.getText().toString().equals("")) {
          String oct = number.getText().toString();
          BigInteger bin = BigInteger.valueOf(Long.parseLong(Integer.toBinaryString(Integer.parseInt(oct, 8))));
          res.setText(String.valueOf(bin));
      }



    }
//   8к10
    public void onClick8to10(View view){
        if (!number.getText().toString().equals(""))
            res.setText(String.valueOf(Integer.parseInt(number.getText().toString(),8)));

    }






}