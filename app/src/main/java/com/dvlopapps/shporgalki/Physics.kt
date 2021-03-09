package com.dvlopapps.shporgalki

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Physics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics)
    }
  public fun kipenieplav(view: View) {
      var   kipenieplavlenieintent  = Intent(this@Physics,KipenieplavlenieActivity :: class.java)
      startActivity(kipenieplavlenieintent)
  }

}