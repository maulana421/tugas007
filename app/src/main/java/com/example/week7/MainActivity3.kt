package com.example.week7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        simpan2.setOnClickListener {
            val awal = ez.text.toString()
            val akhir = ez2.text.toString()


        Intent(Intent(this,MainActivity4::class.java)).also {
            it.putExtra("first",awal)
            it.putExtra("second",akhir)
            startActivity(it)
        }
        }

        simpan5.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}