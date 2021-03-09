package com.dvlopapps.shporgalki

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChimActivity : AppCompatActivity() {
    //ЭЛЕМЕНТЫ
    var H = 1.00f
    var He = 4.00f
    var Li = 6.94f
    var Be = 9.01f
    var B = 10.81f
    var C = 12.01f
    var N = 14.00f
    var O = 16.00f
    var F = 19.00f
    var Ne = 20.18f
    var Na = 22.99f
    var Mg = 24.30f
    var Al = 26.98f
    var Si = 28.08f
    var P = 30.97f
    var S = 32.06f
    var Cl = 35.45f
    var Ar = 39.95f
    var K = 39.10f
    var Ca = 40.08f
    var Sc = 44.96f
    var Ti = 47.88f
    var V = 50.94f
    var Cr = 52.00f
    var Mn = 54.94f
    var Fe = 55.85f
    var Co = 58.93f
    var Ni = 58.69f
    var Cu = 63.55f
    var Zn = 65.39f
    var Ga = 69.72f
    var Ge = 72.59f
    var As = 74.92f
    var Se = 78.96f
    var Br = 79.90f
    var Kr = 83.80f
    var Rb = 85.47f
    var Sr = 87.62f
    var Y = 88.91f
    var Zr = 91.22f
    var Nb = 92.90f
    var Mo = 95.94f
    var Tc = 98.00f
    var Ru = 101.07f
    var Rh = 102.91f
    var Pd = 106.42f
    var Ag = 107.87f
    var Cd = 112.41f
    var In = 114.82f
    var Sn = 118.71f
    var Sb = 121.75f
    var Te = 127.60f
    var I = 126.90f
    var Xe = 131.29f
    var Cs = 132.91f
    var Ba = 137.33f
    var Hf = 178.49f
    var Ta = 180.95f
    var W = 183.85f
    var Re = 186.21f
    var Os = 190.2f
    var Ir = 192.22f
    var Pt = 195.08f
    var Au = 196.97f
    var Hg = 200.59f
    var Tl = 204.383f
    var Pb = 207.2f
    var Bi = 208.98f
    var Po = 209.00f
    var At = 210.00f
    var Rn = 222f
    var Fr = 223f
    var Ra = 226f
    var Rf = 261f
    var Db = 262f
    var Sg = 266f
    var Bh = 267f
    var Hs = 269f
    var Mt = 268f
    var Ds = 271f
    var elem: EditText? = null
    var text: TextView? = null

    //   Стандартная функция которая выполняется при запуске Активвити
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chim)
        //        Обозначение кнопок
        elem = findViewById<View>(R.id.elem) as EditText
        text = findViewById<View>(R.id.ResElem) as TextView
    }

    @SuppressLint("SetTextI18n") //    При нажатии кнопки найти идут проверки
    fun Onclickelemfind(view: View?) {
        if (elem!!.text.toString() == "H") {
            text!!.text = "Масса H:$H"
        } else if (elem!!.text.toString() == "He") {
            text!!.text = "Масса He:$He"
        } else if (elem!!.text.toString() == "Li") {
            text!!.text = "Масса Li:$Li"
        } else if (elem!!.text.toString() == "Be") {
            text!!.text = "Масса Be:$Be"
        } else if (elem!!.text.toString() == "B ") {
            text!!.text = "Масса B :$B"
        } else if (elem!!.text.toString() == "C ") {
            text!!.text = "Масса C :$C"
        } else if (elem!!.text.toString() == "N ") {
            text!!.text = "Масса N :$N"
        } else if (elem!!.text.toString() == "O ") {
            text!!.text = "Масса O :$O"
        } else if (elem!!.text.toString() == "F ") {
            text!!.text = "Масса F :$F"
        } else if (elem!!.text.toString() == "Ne") {
            text!!.text = "Масса Ne:$Ne"
        } else if (elem!!.text.toString() == "Na") {
            text!!.text = "Масса Na:$Na"
        } else if (elem!!.text.toString() == "Mg") {
            text!!.text = "Масса Mg:$Mg"
        } else if (elem!!.text.toString() == "Al") {
            text!!.text = "Масса Al:$Al"
        } else if (elem!!.text.toString() == "Si") {
            text!!.text = "Масса Si:$Si"
        } else if (elem!!.text.toString() == "P ") {
            text!!.text = "Масса P :$P"
        } else if (elem!!.text.toString() == "S ") {
            text!!.text = "Масса S :$S"
        } else if (elem!!.text.toString() == "Cl") {
            text!!.text = "Масса Cl:$Cl"
        } else if (elem!!.text.toString() == "Ar") {
            text!!.text = "Масса Ar:$Ar"
        } else if (elem!!.text.toString() == "K ") {
            text!!.text = "Масса K :$K"
        } else if (elem!!.text.toString() == "Ca") {
            text!!.text = "Масса Ca:$Ca"
        } else if (elem!!.text.toString() == "Sc") {
            text!!.text = "Масса Sc:$Sc"
        } else if (elem!!.text.toString() == "Ti") {
            text!!.text = "Масса Ti:$Ti"
        } else if (elem!!.text.toString() == "V ") {
            text!!.text = "Масса V :$V"
        } else if (elem!!.text.toString() == "Cr") {
            text!!.text = "Масса Cr:$Cr"
        } else if (elem!!.text.toString() == "Mn") {
            text!!.text = "Масса Mn:$Mn"
        } else if (elem!!.text.toString() == "Fe") {
            text!!.text = "Масса Fe:$Fe"
        } else if (elem!!.text.toString() == "Co") {
            text!!.text = "Масса Co:$Co"
        } else if (elem!!.text.toString() == "Ni") {
            text!!.text = "Масса Ni:$Ni"
        } else if (elem!!.text.toString() == "Cu") {
            text!!.text = "Масса Cu:$Cu"
        } else if (elem!!.text.toString() == "Zn") {
            text!!.text = "Масса Zn:$Zn"
        } else if (elem!!.text.toString() == "Ga") {
            text!!.text = "Масса Ga:$Ga"
        } else if (elem!!.text.toString() == "Ge") {
            text!!.text = "Масса Ge:$Ge"
        } else if (elem!!.text.toString() == "As") {
            text!!.text = "Масса As:$As"
        } else if (elem!!.text.toString() == "Se") {
            text!!.text = "Масса Se:$Se"
        } else if (elem!!.text.toString() == "Br") {
            text!!.text = "Масса Br:$Br"
        } else if (elem!!.text.toString() == "Kr") {
            text!!.text = "Масса Kr:$Kr"
        } else if (elem!!.text.toString() == "Rb") {
            text!!.text = "Масса Rb:$Rb"
        } else if (elem!!.text.toString() == "Sr") {
            text!!.text = "Масса Sr:$Sr"
        } else if (elem!!.text.toString() == "Y ") {
            text!!.text = "Масса Y :$Y"
        } else if (elem!!.text.toString() == "Zr") {
            text!!.text = "Масса Zr:$Zr"
        } else if (elem!!.text.toString() == "Nb") {
            text!!.text = "Масса Nb:$Nb"
        } else if (elem!!.text.toString() == "Mo") {
            text!!.text = "Масса Mo:$Mo"
        } else if (elem!!.text.toString() == "Tc") {
            text!!.text = "Масса Tc:$Tc"
        } else if (elem!!.text.toString() == "Ru") {
            text!!.text = "Масса Ru:$Ru"
        } else if (elem!!.text.toString() == "Rh") {
            text!!.text = "Масса Rh:$Rh"
        } else if (elem!!.text.toString() == "Pd") {
            text!!.text = "Масса Pd:$Pd"
        } else if (elem!!.text.toString() == "Ag") {
            text!!.text = "Масса Ag:$Ag"
        } else if (elem!!.text.toString() == "Cd") {
            text!!.text = "Масса Cd:$Cd"
        } else if (elem!!.text.toString() == "In") {
            text!!.text = "Масса In:$In"
        } else if (elem!!.text.toString() == "Sn") {
            text!!.text = "Масса Sn:$Sn"
        } else if (elem!!.text.toString() == "Sb") {
            text!!.text = "Масса Sb:$Sb"
        } else if (elem!!.text.toString() == "Te") {
            text!!.text = "Масса Te:$Te"
        } else if (elem!!.text.toString() == "I ") {
            text!!.text = "Масса I :$I"
        } else if (elem!!.text.toString() == "Xe") {
            text!!.text = "Масса Xe:$Xe"
        } else if (elem!!.text.toString() == "Cs") {
            text!!.text = "Масса Cs:$Cs"
        } else if (elem!!.text.toString() == "Ba") {
            text!!.text = "Масса Ba:$Ba"
        } else if (elem!!.text.toString() == "Hf") {
            text!!.text = "Масса Hf:$Hf"
        } else if (elem!!.text.toString() == "Ta") {
            text!!.text = "Масса Ta:$Ta"
        } else if (elem!!.text.toString() == "W ") {
            text!!.text = "Масса W :$W"
        } else if (elem!!.text.toString() == "Re") {
            text!!.text = "Масса Re:$Re"
        } else if (elem!!.text.toString() == "Os") {
            text!!.text = "Масса Os:$Os"
        } else if (elem!!.text.toString() == "Ir") {
            text!!.text = "Масса Ir:$Ir"
        } else if (elem!!.text.toString() == "Pt") {
            text!!.text = "Масса Pt:$Pt"
        } else if (elem!!.text.toString() == "Au") {
            text!!.text = "Масса Au:$Au"
        } else if (elem!!.text.toString() == "Hg") {
            text!!.text = "Масса Hg:$Hg"
        } else if (elem!!.text.toString() == "Tl") {
            text!!.text = "Масса Tl:$Tl"
        } else if (elem!!.text.toString() == "Pb") {
            text!!.text = "Масса Pb:$Pb"
        } else if (elem!!.text.toString() == "Bi") {
            text!!.text = "Масса Bi:$Bi"
        } else if (elem!!.text.toString() == "Po") {
            text!!.text = "Масса Po:$Po"
        } else if (elem!!.text.toString() == "At") {
            text!!.text = "Масса At:$At"
        } else if (elem!!.text.toString() == "Rn") {
            text!!.text = "Масса Rn:$Rn"
        } else if (elem!!.text.toString() == "Fr") {
            text!!.text = "Масса Fr:$Fr"
        } else if (elem!!.text.toString() == "Ra") {
            text!!.text = "Масса Ra:$Ra"
        } else if (elem!!.text.toString() == "Rf") {
            text!!.text = "Масса Rf:$Rf"
        } else if (elem!!.text.toString() == "Db") {
            text!!.text = "Масса Db:$Db"
        } else if (elem!!.text.toString() == "Sg") {
            text!!.text = "Масса Sg:$Sg"
        } else if (elem!!.text.toString() == "Bh") {
            text!!.text = "Масса Bh:$Bh"
        } else if (elem!!.text.toString() == "Hs") {
            text!!.text = "Масса Hs:$Hs"
        } else if (elem!!.text.toString() == "Mt") {
            text!!.text = "Масса Mt:$Mt"
        } else if (elem!!.text.toString() == "Ds") {
            text!!.text = "Масса Ds:$Ds"
        } else if (elem!!.text.toString() == "") {
            Toast.makeText(applicationContext, "Введите элемент!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(applicationContext, "Элемента не существует", Toast.LENGTH_LONG).show()
        }
    }

    //    Нажатие на кнопку назад
    fun back(view: View?) {
//        Создание интента и запуск его
        val back = Intent(this@ChimActivity, MainActivity::class.java)
        startActivity(back)
    }
}