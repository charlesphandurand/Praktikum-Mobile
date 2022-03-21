fun main() {
    fungsi_matematika()
}

fun fungsi_matematika(){
    print("Nilai x = ")
    val x = readLine()!!.toInt()
    val hasil = 2*x*x+5*x-8;
    print(hasil)
}
