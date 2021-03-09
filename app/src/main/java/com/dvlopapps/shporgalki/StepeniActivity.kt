package com.dvlopapps.shporgalki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StepeniActivity : AppCompatActivity() {
    //Инициализация кнопок
    var num1: EditText? = null
    var num2: EditText? = null
    var result: TextView? = null
    var empty: Toast? = null

    //    Стандарт
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stepeni)
        num1 = findViewById<View>(R.id.firstnum) as EditText
        num2 = findViewById<View>(R.id.secondnum) as EditText
        result = findViewById<View>(R.id.res) as TextView
        empty = Toast.makeText(applicationContext, "Введите оба числа!", Toast.LENGTH_LONG)
    }

    //    Кнопка поиска степени
    fun findstepen(view: View?) {
//       Если оба поля не пустые , то начинается поиск
        if (num1!!.text.toString() != "" && num2!!.text.toString() != "") {
            var n1 = num1!!.text.toString().toInt()
            var n2 = num2!!.text.toString().toInt()
            var res = 1
            for (i in 1..n2) {
                res = res * n1
            }
            result!!.text = res.toString()
        } else empty!!.show()
    }

    fun onclickback(view: View?) {
        val back = Intent(this@StepeniActivity, MathActivity::class.java)
        startActivity(back)
    }
}