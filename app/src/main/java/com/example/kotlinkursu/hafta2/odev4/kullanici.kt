package com.example.kotlinkursu.hafta2.odev4

class Kullanici(val ad: String?, val soyad: String?) {

    fun bilgileriYazdir() {
        // Güvenli çağrılar (safe calls) ile özelliklere erişiyoruz
        val kullaniciAdi = ad?.let { "Ad: $it" } ?: "Ad: Bilgi yok"
        val kullaniciSoyadi = soyad?.let { "Soyad: $it" } ?: "Soyad: Bilgi yok"

        println("$kullaniciAdi, $kullaniciSoyadi")
    }
}