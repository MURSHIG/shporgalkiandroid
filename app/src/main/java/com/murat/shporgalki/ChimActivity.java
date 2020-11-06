package com.murat.shporgalki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ChimActivity extends AppCompatActivity {
    //ЭЛЕМЕНТЫ

    public float H = 1.00f;
    public float He = 4.00f;
    public float Li = 6.94f;
    public float Be = 9.01f;
    public float B = 10.81f;
    public float C = 12.01f;
    public float N = 14.00f;
    public float O = 16.00f;
    public float F = 19.00f;
    public float Ne = 20.18f;
    public float Na = 22.99f;
    public float Mg = 24.30f;
    public float Al = 26.98f;
    public float Si = 28.08f;
    public float P = 30.97f;
    public float S = 32.06f;
    public float Cl = 35.45f;
    public float Ar = 39.95f;
    public float K = 39.10f;
    public float Ca = 40.08f;
    public float Sc = 44.96f;
    public float Ti = 47.88f;
    public float V = 50.94f;
    public float Cr = 52.00f;
    public float Mn = 54.94f;
    public float Fe = 55.85f;
    public float Co = 58.93f;
    public float Ni = 58.69f;
    public float Cu = 63.55f;
    public float Zn = 65.39f;
    public float Ga = 69.72f;
    public float Ge = 72.59f;
    public float As = 74.92f;
    public float Se = 78.96f;
    public float Br = 79.90f;
    public float Kr = 83.80f;
    public float Rb = 85.47f;
    public float Sr = 87.62f;
    public float Y = 88.91f;
    public float Zr = 91.22f;
    public float Nb = 92.90f;
    public float Mo = 95.94f;
    public float Tc = 98.00f;
    public float Ru = 101.07f;
    public float Rh = 102.91f;
    public float Pd = 106.42f;
    public float Ag = 107.87f;
    public float Cd = 112.41f;
    public float In = 114.82f;
    public float Sn = 118.71f;
    public float Sb = 121.75f;
    public float Te = 127.60f;
    public float I = 126.90f;
    public float Xe = 131.29f;
    public float Cs = 132.91f;
    public float Ba = 137.33f;
    public float Hf = 178.49f;
    public float Ta = 180.95f;
    public float W = 183.85f;
    public float Re = 186.21f;
    public float Os = 190.2f;
    public float Ir = 192.22f;
    public float Pt = 195.08f;
    public float Au = 196.97f;
    public float Hg = 200.59f;
    public float Tl = 204.383f;
    public float Pb = 207.2f;
    public float Bi = 208.98f;
    public float Po = 209.00f;
    public float At = 210.00f;
    public float Rn = 222f;
    public float Fr = 223f;
    public float Ra = 226f;
    public float Rf = 261f;
    public float Db = 262f;
    public float Sg = 266f;
    public float Bh = 267f;
    public float Hs = 269f;
    public float Mt = 268f;
    public float Ds = 271f;
    EditText elem;
    TextView text;
//   Стандартная функция которая выполняется при запуске Активвити
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chim);
//        Обозначение кнопок
        elem = (EditText) findViewById(R.id.elem);
        text = (TextView) findViewById(R.id.ResElem);
    }

    @SuppressLint("SetTextI18n")
//    При нажатии кнопки найти идут проверки
    public void Onclickelemfind(View view) {

        if (elem.getText().toString().equals("H")) {
            text.setText("Масса H:" + String.valueOf(H));
        }

        else if (elem.getText().toString().equals("He")){
            text.setText("Масса He:" + String.valueOf(He));
        }
        else if (elem.getText().toString().equals("Li")){
            text.setText("Масса Li:" + String.valueOf(Li));
        }
        else if (elem.getText().toString().equals("Be")){
            text.setText("Масса Be:" + String.valueOf(Be));
        }
        else if (elem.getText().toString().equals("B ")){
            text.setText("Масса B :" + String.valueOf(B ));
        }
        else if (elem.getText().toString().equals("C ")){
            text.setText("Масса C :" + String.valueOf(C ));
        }
        else if (elem.getText().toString().equals("N ")){
            text.setText("Масса N :" + String.valueOf(N ));
        }
        else if (elem.getText().toString().equals("O ")){
            text.setText("Масса O :" + String.valueOf(O ));
        }
        else if (elem.getText().toString().equals("F ")){
            text.setText("Масса F :" + String.valueOf(F ));
        }
        else if (elem.getText().toString().equals("Ne")){
            text.setText("Масса Ne:" + String.valueOf(Ne));
        }
        else if (elem.getText().toString().equals("Na")){
            text.setText("Масса Na:" + String.valueOf(Na));
        }
        else if (elem.getText().toString().equals("Mg")){
            text.setText("Масса Mg:" + String.valueOf(Mg));
        }
        else if (elem.getText().toString().equals("Al")){
            text.setText("Масса Al:" + String.valueOf(Al));
        }
        else if (elem.getText().toString().equals("Si")){
            text.setText("Масса Si:" + String.valueOf(Si));
        }
        else if (elem.getText().toString().equals("P ")){
            text.setText("Масса P :" + String.valueOf(P ));
        }
        else if (elem.getText().toString().equals("S ")){
            text.setText("Масса S :" + String.valueOf(S ));
        }
        else if (elem.getText().toString().equals("Cl")){
            text.setText("Масса Cl:" + String.valueOf(Cl));
        }
        else if (elem.getText().toString().equals("Ar")){
            text.setText("Масса Ar:" + String.valueOf(Ar));
        }
        else if (elem.getText().toString().equals("K ")){
            text.setText("Масса K :" + String.valueOf(K ));
        }
        else if (elem.getText().toString().equals("Ca")){
            text.setText("Масса Ca:" + String.valueOf(Ca));
        }
        else if (elem.getText().toString().equals("Sc")){
            text.setText("Масса Sc:" + String.valueOf(Sc));
        }
        else if (elem.getText().toString().equals("Ti")){
            text.setText("Масса Ti:" + String.valueOf(Ti));
        }
        else if (elem.getText().toString().equals("V ")){
            text.setText("Масса V :" + String.valueOf(V ));
        }
        else if (elem.getText().toString().equals("Cr")){
            text.setText("Масса Cr:" + String.valueOf(Cr));
        }
        else if (elem.getText().toString().equals("Mn")){
            text.setText("Масса Mn:" + String.valueOf(Mn));
        }
        else if (elem.getText().toString().equals("Fe")){
            text.setText("Масса Fe:" + String.valueOf(Fe));
        }
        else if (elem.getText().toString().equals("Co")){
            text.setText("Масса Co:" + String.valueOf(Co));
        }
        else if (elem.getText().toString().equals("Ni")){
            text.setText("Масса Ni:" + String.valueOf(Ni));
        }
        else if (elem.getText().toString().equals("Cu")){
            text.setText("Масса Cu:" + String.valueOf(Cu));
        }
        else if (elem.getText().toString().equals("Zn")){
            text.setText("Масса Zn:" + String.valueOf(Zn));
        }
        else if (elem.getText().toString().equals("Ga")){
            text.setText("Масса Ga:" + String.valueOf(Ga));
        }
        else if (elem.getText().toString().equals("Ge")){
            text.setText("Масса Ge:" + String.valueOf(Ge));
        }
        else if (elem.getText().toString().equals("As")){
            text.setText("Масса As:" + String.valueOf(As));
        }
        else if (elem.getText().toString().equals("Se")){
            text.setText("Масса Se:" + String.valueOf(Se));
        }
        else if (elem.getText().toString().equals("Br")){
            text.setText("Масса Br:" + String.valueOf(Br));
        }
        else if (elem.getText().toString().equals("Kr")){
            text.setText("Масса Kr:" + String.valueOf(Kr));
        }
        else if (elem.getText().toString().equals("Rb")){
            text.setText("Масса Rb:" + String.valueOf(Rb));
        }
        else if (elem.getText().toString().equals("Sr")){
            text.setText("Масса Sr:" + String.valueOf(Sr));
        }
        else if (elem.getText().toString().equals("Y ")){
            text.setText("Масса Y :" + String.valueOf(Y ));
        }
        else if (elem.getText().toString().equals("Zr")){
            text.setText("Масса Zr:" + String.valueOf(Zr));
        }
        else if (elem.getText().toString().equals("Nb")){
            text.setText("Масса Nb:" + String.valueOf(Nb));
        }
        else if (elem.getText().toString().equals("Mo")){
            text.setText("Масса Mo:" + String.valueOf(Mo));
        }
        else if (elem.getText().toString().equals("Tc")){
            text.setText("Масса Tc:" + String.valueOf(Tc));
        }
        else if (elem.getText().toString().equals("Ru")){
            text.setText("Масса Ru:" + String.valueOf(Ru));
        }
        else if (elem.getText().toString().equals("Rh")){
            text.setText("Масса Rh:" + String.valueOf(Rh));
        }
        else if (elem.getText().toString().equals("Pd")){
            text.setText("Масса Pd:" + String.valueOf(Pd));
        }
        else if (elem.getText().toString().equals("Ag")){
            text.setText("Масса Ag:" + String.valueOf(Ag));
        }
        else if (elem.getText().toString().equals("Cd")){
            text.setText("Масса Cd:" + String.valueOf(Cd));
        }
        else if (elem.getText().toString().equals("In")){
            text.setText("Масса In:" + String.valueOf(In));
        }
        else if (elem.getText().toString().equals("Sn")){
            text.setText("Масса Sn:" + String.valueOf(Sn));
        }
        else if (elem.getText().toString().equals("Sb")){
            text.setText("Масса Sb:" + String.valueOf(Sb));
        }
        else if (elem.getText().toString().equals("Te")){
            text.setText("Масса Te:" + String.valueOf(Te));
        }
        else if (elem.getText().toString().equals("I ")){
            text.setText("Масса I :" + String.valueOf(I ));
        }
        else if (elem.getText().toString().equals("Xe")){
            text.setText("Масса Xe:" + String.valueOf(Xe));
        }
        else if (elem.getText().toString().equals("Cs")){
            text.setText("Масса Cs:" + String.valueOf(Cs));
        }
        else if (elem.getText().toString().equals("Ba")){
            text.setText("Масса Ba:" + String.valueOf(Ba));
        }
        else if (elem.getText().toString().equals("Hf")){
            text.setText("Масса Hf:" + String.valueOf(Hf));
        }
        else if (elem.getText().toString().equals("Ta")){
            text.setText("Масса Ta:" + String.valueOf(Ta));
        }
        else if (elem.getText().toString().equals("W ")){
            text.setText("Масса W :" + String.valueOf(W ));
        }
        else if (elem.getText().toString().equals("Re")){
            text.setText("Масса Re:" + String.valueOf(Re));
        }
        else if (elem.getText().toString().equals("Os")){
            text.setText("Масса Os:" + String.valueOf(Os));
        }
        else if (elem.getText().toString().equals("Ir")){
            text.setText("Масса Ir:" + String.valueOf(Ir));
        }
        else if (elem.getText().toString().equals("Pt")){
            text.setText("Масса Pt:" + String.valueOf(Pt));
        }
        else if (elem.getText().toString().equals("Au")){
            text.setText("Масса Au:" + String.valueOf(Au));
        }
        else if (elem.getText().toString().equals("Hg")){
            text.setText("Масса Hg:" + String.valueOf(Hg));
        }
        else if (elem.getText().toString().equals("Tl")){
            text.setText("Масса Tl:" + String.valueOf(Tl));
        }
        else if (elem.getText().toString().equals("Pb")){
            text.setText("Масса Pb:" + String.valueOf(Pb));
        }
        else if (elem.getText().toString().equals("Bi")){
            text.setText("Масса Bi:" + String.valueOf(Bi));
        }
        else if (elem.getText().toString().equals("Po")){
            text.setText("Масса Po:" + String.valueOf(Po));
        }
        else if (elem.getText().toString().equals("At")){
            text.setText("Масса At:" + String.valueOf(At));
        }
        else if (elem.getText().toString().equals("Rn")){
            text.setText("Масса Rn:" + String.valueOf(Rn));
        }
        else if (elem.getText().toString().equals("Fr")){
            text.setText("Масса Fr:" + String.valueOf(Fr));
        }
        else if (elem.getText().toString().equals("Ra")){
            text.setText("Масса Ra:" + String.valueOf(Ra));
        }
        else if (elem.getText().toString().equals("Rf")){
            text.setText("Масса Rf:" + String.valueOf(Rf));
        }
        else if (elem.getText().toString().equals("Db")){
            text.setText("Масса Db:" + String.valueOf(Db));
        }
        else if (elem.getText().toString().equals("Sg")){
            text.setText("Масса Sg:" + String.valueOf(Sg));
        }
        else if (elem.getText().toString().equals("Bh")){
            text.setText("Масса Bh:" + String.valueOf(Bh));
        }
        else if (elem.getText().toString().equals("Hs")){
            text.setText("Масса Hs:" + String.valueOf(Hs));
        }
        else if (elem.getText().toString().equals("Mt")){
            text.setText("Масса Mt:" + String.valueOf(Mt));
        }
        else if (elem.getText().toString().equals("Ds")){
            text.setText("Масса Ds:" + String.valueOf(Ds));
        }
//        Если ничего не вписано
        else if (elem.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Введите элемент!",Toast.LENGTH_LONG).show();
        }
//        Если элемент не существует
        else {
            Toast.makeText(getApplicationContext(),"Элемента не существует",Toast.LENGTH_LONG).show();
        }


    }
//    Нажатие на кнопку назад
    public void back(View view){
//        Создание интента и запуск его
        Intent back = new Intent(ChimActivity.this,MainActivity.class);
        startActivity(back);
    }
}