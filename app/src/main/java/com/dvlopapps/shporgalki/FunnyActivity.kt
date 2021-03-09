package com.dvlopapps.shporgalki

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class FunnyActivity : AppCompatActivity() {
    var vid: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Design_NoActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny)
    }

    fun Polizei(view: View?) {
        val polizei = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2Mv25IUI0RU"))
        startActivity(polizei)
    }

    fun back(view: View?) {
        val back = Intent(this@FunnyActivity, MainActivity::class.java)
        startActivity(back)
    }

    fun pumpedkicks(view: View?) {
        val kicks = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/bjwgt1kRqEU?t=144"))
        startActivity(kicks)
    }

    fun odlechet(view: View?) {
        val odlechet = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Y1s_WAxNCCw"))
        startActivity(odlechet)
    }

    fun levapolka(view: View?) {
        val leva = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/vs1mXnWuHd8"))
        startActivity(leva)
    }

    fun peppa(view: View?) {
        val peppa = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zAfCEJZDOPI"))
        startActivity(peppa)
    }
}