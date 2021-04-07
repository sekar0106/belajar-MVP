package io.github.sekar0106.belajararsitekturmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import io.github.sekar0106.belajararsitekturmvp.presenter.LuasPresenter
import io.github.sekar0106.belajararsitekturmvp.presenter.LuasView

class MainActivity : AppCompatActivity(),
    LuasView {

    //menginisialisasikan luaspresenter
    //dan menginisialisasikan untuk komponen UI
    private lateinit var presenter: LuasPresenter
    private lateinit var etPanjang: EditText
    private lateinit var  etLebar: EditText
    private lateinit var tvHasilLuasPersegiPanjang: TextView
    private lateinit var btnHitungLuasPersegiPanjang: Button
    private lateinit var etSisi: EditText
    private lateinit var tvHasilLuasPersegi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mengambil yang sudah diinisialisasikan diatas
        presenter =
            LuasPresenter(this)

        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        tvHasilLuasPersegiPanjang = findViewById(R.id.tv_hasil_luas_persegi_panjang)
        btnHitungLuasPersegiPanjang = findViewById(R.id.btn_hitung_luas_persegi_panjang)
        etSisi = findViewById(R.id.et_sisi)
        tvHasilLuasPersegi = findViewById(R.id.tv_hasil_luas_persegi)

        btnHitungLuasPersegiPanjang.setOnClickListener {
            val panjang = etPanjang.text.toString().trim().toFloat()
            val lebar = etLebar.text.toString().trim().toFloat()
            val sisi = etSisi.text.toString().trim().toFloat()

            //memasukkan value dari setonclick ke dalam hitungluasperseginya presenter
            //nanti proses perhitungan dilakukan oleh presenter
            presenter.hitungLuasPersegi(panjang, lebar, sisi)
        }
    }

    //hasilnya keluar disini
    override fun hasilLuasPersegiPanjang(luas: Float) {
        tvHasilLuasPersegiPanjang.text = luas.toString()

    }

    override fun hasilLuasPersegi(luas: Float) {
        tvHasilLuasPersegi.text = luas.toString()

    }

}