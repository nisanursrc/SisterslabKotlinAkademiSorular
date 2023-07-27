package com.example.kotlinkursu.hafta2.odev1

fun main() {
    // Dikdörtgen örneği
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgenin Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgenin Çevresi: ${dikdortgen.cevreHesapla()}")

    // Daire örneği
    val daire = Daire(4.0)
    println("Dairenin Alanı: ${daire.alanHesapla()}")
    println("Dairenin Çevresi: ${daire.cevreHesapla()}")
}