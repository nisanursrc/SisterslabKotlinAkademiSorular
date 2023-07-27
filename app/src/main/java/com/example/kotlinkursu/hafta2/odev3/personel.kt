package com.example.kotlinkursu.hafta2.odev3

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    // Personelin özellikleri: ad, soyad, pozisyon ve maaş

    // Maaşı artırmak için kullanılacak işlev
    fun maasArttir(miktar: Double) {
        maas += miktar
    }
}