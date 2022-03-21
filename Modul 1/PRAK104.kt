class Hewan (val namaHewan: String, val tipeHewan: String, val jumlahKaki: Int){
    fun cetak(){
        println("""
            Nama Hewan: $namaHewan
            Tipe Hewan: $tipeHewan
            Jumlah Kaki: $jumlahKaki

        """.trimIndent())
    }
}

fun main() {
    val kucing = Hewan("Kucing", "Karnivora", 4)
    kucing.cetak()
    val sapi = Hewan("Sapi", "Herbivora", 4)
    sapi.cetak()
}