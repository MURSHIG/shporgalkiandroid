package com.dvlopapps.shporgalki

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class KipenieplavlenieActivity : AppCompatActivity() {
    var C: EditText? = null
    var M: EditText? = null
    var t1: EditText? = null
    var t_kip: EditText? = null
    var t2: EditText? = null
    var res: TextView? = null
    var stepen: EditText? = null
    var numberNotFounded: Toast? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kipenieplavlenie)
        C = findViewById(R.id.C)
        M = findViewById(R.id.m)
        t1 = findViewById(R.id.t1)
        t_kip = findViewById(R.id.t_kip)
        t2 = findViewById(R.id.t2)
        numberNotFounded = Toast.makeText(applicationContext, "Неправильный формат!", Toast.LENGTH_SHORT)
        res = findViewById(R.id.reskipPlav)
        stepen = findViewById(R.id.stepen)
    }
    private fun edittofloat(e: EditText?) : Float {
        return e!!.text.toString().toFloat()
    }
    fun dovdotemp(view: View?) {
        if (C!!.text.toString() != "" && M!!.text.toString() != "" && t1!!.text.toString() != "" && t2!!.text.toString() != "") {
            try {
               var result : Float = ((edittofloat(C)) * (edittofloat(M) * ((edittofloat(t2)) - (edittofloat(t1)))))
                if (result % 10 == 0f) {
                    result = result.toInt().toFloat()
                }
                res!!.text = "${result.toString()} Дж"
            }
            catch (e : Exception) {
                numberNotFounded!!.show()
            }
        }
        else numberNotFounded!!.show()
    }
    fun kipenie (view : View ) {
      if (stepen!!.text.toString() != "" && C!!.text.toString() != "" && M!!.text.toString() != "" ) {
          try {
              var result: Float = ((edittofloat(C)) * edittofloat(stepen) * edittofloat(M))

              if (result % 10 == 0f) {
                  result = result.toInt().toFloat()
              }
              res!!.text = "${result.toString()} Дж"
          }catch (e : Exception) {
              numberNotFounded!!.show()
          }
      }
        else numberNotFounded!!.show()

      }
    }


