package io.github.sekar0106.belajararsitekturmvp.presenter

class LuasPresenter(
    private val LuasView: LuasView
) {
    //membuat method hitung luas persegi dengan 2 parameter
    // panjang dan lebar dengan masing2 tipe float
    fun hitungLuasPersegi(panjang: Float, lebar: Float, sisi: Float){
        val hasil = panjang * lebar
        val hasilpersegi = sisi * sisi

        //hasil dimasukkan disini
        LuasView.hasilLuasPersegiPanjang(hasil)
        LuasView.hasilLuasPersegi(hasilpersegi)
    }
}