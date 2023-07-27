package com.example.kotlinkursu.hafta2.odev3

fun main() {

    val personel = Personel("Nisanur", "Sürücü", "Polis", 15000.0)

    // Personelin özelliklerini yazdıralım
    println("Personel Adı: ${personel.ad}")
    println("Personel Soyadı: ${personel.soyad}")
    println("Personel Pozisyonu: ${personel.pozisyon}")
    println("Personel Maaşı: ${personel.maas}")


    personel.maasArttir(3000.0)


    println("Yeni Maaş: ${personel.maas}")
}