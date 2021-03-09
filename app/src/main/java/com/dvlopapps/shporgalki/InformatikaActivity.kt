package com.dvlopapps.shporgalki

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class InformatikaActivity : AppCompatActivity() {
    var number: EditText? = null
    var res: TextView? = null
    var empty: Toast? = null
    var formaterror: Toast? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informatika)
        number = findViewById<View>(R.id.Numberinfo) as EditText
        res = findViewById<View>(R.id.resinfo) as TextView
        empty = Toast.makeText(applicationContext, "Введите число!", Toast.LENGTH_SHORT)
        formaterror = Toast.makeText(applicationContext, "Неправильный формат", Toast.LENGTH_SHORT)
    }

    //    Назад
    fun onclickbackinfo(view: View?) {
        val back = Intent(this@InformatikaActivity, MainActivity::class.java)
        startActivity(back)
    }

    //    10к2
    fun onClicktento2(view: View?) {
        if (number!!.text.toString() != "") try {
            res!!.text = Integer.toBinaryString(number!!.text.toString().toInt())
        } catch (exception: Exception) {
            formaterror!!.show()
        } else empty!!.show()
    }

    // 10к8
    fun onClicktento8(view: View?) {
        if (number!!.text.toString() != "") try {
            res!!.text = Integer.toOctalString(number!!.text.toString().toInt())
        } catch (exception: Exception) {
            formaterror!!.show()
        } else empty!!.show()
    }

    // 10к16
    fun onClicktento16(view: View?) {
        if (number!!.text.toString() != "") try {
            res!!.text = Integer.toHexString(number!!.text.toString().toInt()).toUpperCase()
        } catch (exception: Exception) {
            formaterror!!.show()
        } else empty!!.show()
    }

    // 2к10
    fun onClicktwoto10(view: View?) {
        if (number!!.text.toString() != "") try {
            res!!.text = number!!.text.toString().toInt(2).toString()
        } catch (exception: Exception) {
            formaterror!!.show()
        } else empty!!.show()
    }

    // 2к8
    fun onClicktwoto8(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var bin = number!!.text.toString()
                var oct = Integer.toOctalString(bin.toInt(8))
                res!!.text = oct
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    // 2к16
    fun onClicktwoto16(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var bin = number!!.text.toString()
                var Hex = Integer.toHexString(bin.toInt(2))
                res!!.text = Hex.toUpperCase()
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    // 16к2
    fun onClick16to2(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var Hex = number!!.text.toString()
                var bin = BigInteger.valueOf(Integer.toBinaryString(Hex.toInt(16)).toLong())
                res!!.text = bin.toString()
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    // 16к8
    fun onClick16to8(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var Hex = number!!.text.toString()
                var oct = Integer.toOctalString(Hex.toInt(16))
                res!!.text = oct
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    // 16к10
    fun onClick16to10(view: View?) {
        if (number!!.text.toString() != "") try {
            res!!.text = number!!.text.toString().toInt(16).toString()
        } catch (exception: Exception) {
            formaterror!!.show()
        } else empty!!.show()
    }

    // 8к16
    fun onClick8to16(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var oct = number!!.text.toString()
                var Hex = Integer.toHexString(oct.toInt(16))
                res!!.text = Hex.toUpperCase()
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    //   8к2
    fun onClick8to2(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                var oct = number!!.text.toString()
                var bin = BigInteger.valueOf(Integer.toBinaryString(oct.toInt(8)).toLong())
                res!!.text = bin.toString()
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }

    //   8к10
    fun onClick8to10(view: View?) {
        if (number!!.text.toString() != "") {
            try {
                res!!.text = number!!.text.toString().toInt(8).toString()
            } catch (exception: Exception) {
                formaterror!!.show()
            }
        } else empty!!.show()
    }
}