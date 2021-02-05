package com.example.week7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        set1.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        but2.setOnClickListener {
            val github = Intent(Intent.ACTION_VIEW)
            github.setData(Uri.parse("https://github.com/maulana421"))
            startActivity(github)

        }
        but3.setOnClickListener {
            startActivity(Intent(this,finish()::class.java))
            finish()

        }
        but4.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
            finish()
        }


        

    }
}