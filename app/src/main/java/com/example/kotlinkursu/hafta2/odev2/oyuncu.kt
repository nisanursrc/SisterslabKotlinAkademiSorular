package com.example.kotlinkursu.hafta2.odev2

open class Oyuncu(val ad: String, val yas: Int) {

    open fun oyna() {
        println("$ad oyun oynuyor.")
    }
}