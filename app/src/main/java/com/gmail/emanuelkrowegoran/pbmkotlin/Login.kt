package com.gmail.emanuelkrowegoran.pbmkotlin

//Mendeklarasikan package yang digunakan

import android.content.Intent
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.gmail.emanuelkrowegoran.pbmjava.R

//Menginportkan data data android yang dibutuhkan

class Login : AppCompatActivity() {
    //keleas Login yang bersifat public

    internal lateinit var username: EditText
    internal lateinit var password: EditText
    internal lateinit var btnLogin: Button
    //Mendeklarasikan EditText dan button yang digunakan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //Menghubungkan kelas ini ke kelas xml

        username = findViewById<View>(R.id.username) as EditText
        password = findViewById<View>(R.id.password) as EditText
        btnLogin = findViewById<View>(R.id.btnLogin) as Button
        //Mendeklarasikan button dan text pada kelas ini yang diambil pada kelas xml

        btnLogin.setOnClickListener {
            val usernameKey = username.text.toString()
            val passwordKey = password.text.toString()
            //Pada button Login ketika diklik maka akan mengambil username dan pasword yang telah diinputkan

            if (usernameKey == "Emanuel" && passwordKey == "165410097") {
                //Menggunakan If jika username = Emanuel dan pasword 165410097 yang diinputkan malaLogin berhasil
                //jika login berhasil
                Toast.makeText(applicationContext, "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show()
                val intent = Intent(this@Login, MainActivity::class.java)
                this@Login.startActivity(intent)
                finish()
                //Jika sesuai maka pindah ke layout selanjutnya dengan fungsi intent ke kelas MainActivty
            } else {
                //jika login gagal
                val builder = AlertDialog.Builder(this@Login)
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show()
                //Jika gagal maka akan ada pemberitahuan username dan paswword salah.
            }
        }

    }

    //Sedangkan pada button registrasi kita menggunakan intent pada buttonOnclick nya
    //ketika diklik maka akan dipindahkan ke layout Registrasi
    fun ButtonOnClick(View: View) {
        val intent = Intent(this@Login, Registrasi::class.java)
        this@Login.startActivity(intent)

    }
}