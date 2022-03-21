import kotlin.system.exitProcess

fun main(){

    print("Waktu Sekarang: ")
    val waktu = readLine();
    if (waktu.equals("pagi", true)){
    } else if (waktu.equals("siang", true)){
    } else if (waktu.equals("sore", true)){
    } else if (waktu.equals("malam", true)) {
    } else{
        println("Hanya menerima input berupa waktu (Pagi, Siang, Sore, Malam)")
        exitProcess(1)
    }

    print("Nama Anda: ")
    val nama = readLine();
    print("Umur Anda: ")
    val umur = readLine()!!.toInt();
    val min = 35;
    val max = 37;
    val suhuRandom: Double = min + Math.random() * (max - min)
    println("Suhu Tubuh Anda: ${String.format("%.1f", suhuRandom)}\n")

    println("""
        Selamat $waktu, $nama.
        Umur anda $umur Tahun.
        Suhu Tubuh anda ${String.format("%.1f", suhuRandom)} derajat
        Celcius.
    """.trimIndent())
}
