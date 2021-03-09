package com.dvlopapps.shporgalki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var mathem: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mathclick(v: View?) {
        val math = Intent(this@MainActivity, MathActivity::class.java)
        startActivity(math)
    }

    fun chimclick(view: View?) {
        val chim = Intent(this@MainActivity, ChimActivity::class.java)
        startActivity(chim)
    }

    fun InfoClick(view: View?) {
        val info = Intent(this@MainActivity, InformatikaActivity::class.java)
        startActivity(info)
    }

    fun PhysClick(view: View?) {
        val phys = Intent(this@MainActivity, Physics::class.java)
        startActivity(phys)
    }

    fun Prikoli(view: View?) {
        val prikoli = Intent(this@MainActivity, FunnyActivity::class.java)
        startActivity(prikoli)
    }
}