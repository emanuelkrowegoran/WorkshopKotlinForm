package com.gmail.emanuelkrowegoran.pbmkotlin

//Mendeklarasikan package yang digunakan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.gmail.emanuelkrowegoran.pbmjava.R

class MainActivity : AppCompatActivity() {
    internal lateinit var list: ListView
    //Mendekalrasikan varible listview yang digunakan

    internal var maintitle = arrayOf("Muhammad. Bilal R", "Danis Pangestu", "Mikael Dionito Harbigantara", "Antonius Jonatan B.W", "Danang Triyanto", "M.Nur Ashidiq", "Zaqie Alfatah", "Mitha Ulum", "Adi primanto", "Pamungkas", "Sahril")
    //Mendmbuat maintitle pada listview yang bertipe intteger dengan isi seperti diatas


    internal var subtitle = arrayOf("seventee17@gmail.com", "danispangestu@gmail.com", "mikaeldionitoharbigantara@gmail.com", "antonius1398@gmail.com", "danang17@gmail.com", "mayangsidik@gmail.com", "zaqiebot@gmail.com", "cahgaming77@gmail.com", "adiprimanto@gmail.com", "pamungkas@gmail.com", "sahrilhasan@gmail.com")
    //Lalu membuat subntitle yang berda dibawa maintitle pada listview dengan bertipe string dan isi email

    internal var imgid = arrayOf<Int>(R.drawable.bilal, R.drawable.danis, R.drawable.mikael, R.drawable.anton, R.drawable.danang, R.drawable.sidik, R.drawable.zaqie, R.drawable.ulum, R.drawable.masadi, R.drawable.maspam, R.drawable.sahril)
    //Memeasukkan gambar pada list view yang diinport data gambarnya dari drawble

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Menghubungkan kelas ini kekelas xmlnya
        val adapter = listisiview(this, maintitle, subtitle, imgid)
        list = findViewById<View>(R.id.list) as ListView
        list.adapter = adapter
        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            //Mendeklarasikan maintle,subtitle dan gambar yang digunakan
            // TODO Auto-generated method stub


            //mendeklkarasikan ketika dipilih posityion 0 dan seterusnya  pada list view maka akan menampilkan keterangan
            //spesifikasi kode yang dipilih,ketika diklik maka akan menampilkan keterangan sesui text ini
            if (position == 0) {
                Toast.makeText(applicationContext, "Muhammad. Bilal R", Toast.LENGTH_SHORT).show()
            } else if (position == 1) {
                Toast.makeText(applicationContext, "Danis Pangestu", Toast.LENGTH_SHORT).show()
            } else if (position == 2) {
                Toast.makeText(applicationContext, "Mikael Dionito Harbigantara", Toast.LENGTH_SHORT).show()
            } else if (position == 3) {
                Toast.makeText(applicationContext, "Antonius Jonatan B.W", Toast.LENGTH_SHORT).show()
            } else if (position == 4) {
                Toast.makeText(applicationContext, "Danang Triyanto", Toast.LENGTH_SHORT).show()
            } else if (position == 5) {
                Toast.makeText(applicationContext, "M.Nur Ashidiq", Toast.LENGTH_SHORT).show()
            } else if (position == 6) {
                Toast.makeText(applicationContext, "Zaqie Alfatah", Toast.LENGTH_SHORT).show()
            } else if (position == 7) {
                Toast.makeText(applicationContext, "Mitha Ulum", Toast.LENGTH_SHORT).show()
            } else if (position == 8) {
                Toast.makeText(applicationContext, "Adi primanto", Toast.LENGTH_SHORT).show()
            } else if (position == 9) {
                Toast.makeText(applicationContext, "Pamungkas", Toast.LENGTH_SHORT).show()
            } else if (position == 10) {
                Toast.makeText(applicationContext, "sahril", Toast.LENGTH_SHORT).show()
                //sampai pada position 10 karena data listview yang digunakan ada 11 jadi jika dihitung mulai 0 maka data 1 sampai 10
            }
        }
    }
}
