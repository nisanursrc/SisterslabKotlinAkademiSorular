package com.example.kotlinkursu.hafta2.odev4

fun main() {

    val kullanici1 = Kullanici("Ali", "Yılmaz")
    val kullanici2 = Kullanici("Ahmet", null)
    val kullanici3 = Kullanici(null, "Kaya")
    val kullanici4 = Kullanici(null, null)


    kullanici1.bilgileriYazdir()
    kullanici2.bilgileriYazdir()
    kullanici3.bilgileriYazdir()
    kullanici4.bilgileriYazdir()
}