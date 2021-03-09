package com.dvlopapps.shporgalki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class FactorialActivity : AppCompatActivity() {
    //    Обозачаю кнопки
    var number: EditText? = null
    var text: TextView? = null

    //Стандарт
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial)
        //        Текстовые поля
        number = findViewById<View>(R.id.Number) as EditText
        text = findViewById<View>(R.id.Text) as TextView
    }

    //Назад
    fun onclickback(view: View?) {
        val back = Intent(this@FactorialActivity, MathActivity::class.java)
        startActivity(back)
    }

    //Нажатие на кнопку
    fun Onclickfind(view: View?) {
//       Если поле не пустое начинается поиск
        if (number!!.text.toString() != "" && number!!.text.toString().toInt() <= 20000) {
            //Факториал
            var n1 = number!!.text.toString().toInt()
            var result = BigInteger.ONE
            for (i in 1..n1) {
                result = result.multiply(BigInteger.valueOf(i.toLong()))
            }
            text!!.text = result.toString()
        } else if (number!!.text.toString().toInt() > 20000) {
            Toast.makeText(applicationContext, "Числа больше 20000 не воспринимаются так как они слишком большие!", Toast.LENGTH_SHORT).show()
        } else Toast.makeText(applicationContext, "Введите число!", Toast.LENGTH_SHORT).show()
    }
}