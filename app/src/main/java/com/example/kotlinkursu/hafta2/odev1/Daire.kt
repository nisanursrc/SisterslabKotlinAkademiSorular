package com.example.kotlinkursu.hafta2.odev1

import java.lang.Math.PI

class Daire(val yaricap: Double) : GeometrikSekil() {
    // Dairenin alanını hesaplayan işlev
    fun alanHesapla(): Double {
        return PI * yaricap * yaricap
    }

    // Dairenin çevresini hesaplayan işlev
    fun cevreHesapla(): Double {
        return 2 * PI * yaricap
    }
}