package com.example.kotlinkursu.hafta2.odev2

class Futbolcu(ad: String, yas: Int, val takim: String) : Oyuncu(ad, yas) {

    override fun oyna() {
        println("$ad $takim takımında futbol oynuyor.")
    }
}