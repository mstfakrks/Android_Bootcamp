package Odev2

fun celsiusToFahrenheit(c: Double) : Double {
    return c * 1.8 + 32
}
fun dikdortgenCevresiHesapla(kenar1: Int, kenar2: Int) : Int {
    return 2 * kenar1 + 2 * kenar2
}
fun faktoriyelHesapla(sayi: Long) : Long {
    var toplam = 1L
    for (i in 1..sayi){
        toplam *= i
    }
    return toplam
}
fun kacTaneAHarfiVar(kelime: String) : Int  {
    var sayac = 0
    for (harf in kelime) {
        if (harf.lowercaseChar() == 'a'){
            sayac ++
        }
    }
    return sayac
    //return kelime.count { it.lowercaseChar() == 'a' }
}
fun IcAcılarToplamıHesapla(kenarSayisi: Int): Int {
    return (kenarSayisi-2) * 180
}
fun maasHesapla(gunSayisi: Int) : Double {
    val toplamSaat = gunSayisi * 8
    var maas : Double
    if (toplamSaat > 160) {
        maas = (160*10.0) + (toplamSaat - 160) * 20.0
    }else {
        maas = toplamSaat * 10.0
    }
    return maas
}
fun kotaHesapla(kota: Int) : Int {
    var ucret : Int
    if (kota > 50){
        ucret = 100 + (kota-50) * 4
    }else{
        ucret = 100
    }
    return ucret
}


fun main() {
    println("Fahrenheit : " + celsiusToFahrenheit(35.0))
    println("Dikdörtgen Çevresi : " + dikdortgenCevresiHesapla(8,6))
    println("Faktöriyel: " + faktoriyelHesapla(20))
    println("A harfi sayısı: " + kacTaneAHarfiVar("mustafa"))
    println("İç Açılar Toplamı " + IcAcılarToplamıHesapla(3))
    println("Maaş: " + maasHesapla(25))
    println("Kota Ücreti: " + kotaHesapla(75))


}