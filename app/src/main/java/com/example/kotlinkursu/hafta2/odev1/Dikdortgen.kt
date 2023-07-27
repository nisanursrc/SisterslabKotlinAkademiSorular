package com.example.kotlinkursu.hafta2.odev1

class Dikdortgen(val uzunluk: Double, val genislik: Double) : GeometrikSekil() {
    // Dikdörtgenin alanını hesaplayan işlev
    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    // Dikdörtgenin çevresini hesaplayan işlev
    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}