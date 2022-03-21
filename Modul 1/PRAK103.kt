fun main() {
    print("Input bilangan = ")
    var bilangan : Int = readLine()!!.toInt()
    val kelipatan : Int = bilangan

    for (i in 1..7){
        bilangan += kelipatan;
        if (bilangan % 2 == 0 || bilangan % 3 == 0){
            print(bilangan)
            print(" ")
        }
    }
}