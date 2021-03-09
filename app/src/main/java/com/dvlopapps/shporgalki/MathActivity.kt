package com.dvlopapps.shporgalki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MathActivity : AppCompatActivity() {
    //   Инициализациря кнопок
    var back: ImageButton? = null
    var fact: Button? = null
    var stepen: Button? = null

    //Стандарт
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)
        back = findViewById<View>(R.id.back) as ImageButton
        fact = findViewById<View>(R.id.factorial) as Button
        stepen = findViewById<View>(R.id.stepen) as Button
    }

    //    Переход на ФакториалАктивити
    fun onClickFact(view: View?) {
        val tofact = Intent(this@MathActivity, FactorialActivity::class.java)
        startActivity(tofact)
    }

    //Переход на СтепениАктивити
    //К степени
    fun onClickstep(view: View?) {
        val tostep = Intent(this@MathActivity, StepeniActivity::class.java)
        startActivity(tostep)
    } //Назад

    fun onclickback(view: View?) {
        val back = Intent(this@MathActivity, MainActivity::class.java)
        startActivity(back)
    }
}