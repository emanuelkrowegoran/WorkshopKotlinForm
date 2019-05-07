package com.gmail.emanuelkrowegoran.pbmkotlin

//Mendeklarasikan package yang digunakan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.gmail.emanuelkrowegoran.pbmjava.R


class Registrasi : AppCompatActivity() {
    //mendeklarasikan button yang di gunakan pada kelas Registrasii yaitu button dengan nama btnOK
    internal lateinit var btnOK: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        //Menghubungkan kelas ini ke kelas xml activty_registrasi

        btnOK = findViewById<View>(R.id.btnOK) as Button
        //Mendeklarasikan button yang akan digunakan pada kelas ini yang terhubung pada kelas xml

        btnOK.setOnClickListener {
            val intent = Intent(this@Registrasi, MainActivity::class.java)
            this@Registrasi.startActivity(intent)
            //Membuat action intent pada button btnOK ketika diklik maka akan berpindah ke layout MainActivty
        }
    }
}