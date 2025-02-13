class PersegiPanjang(val panjang: Int, val lebar: Int) {
    fun luas() = panjang * lebar
    fun keliling() = 2 * (panjang + lebar)
}
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Masukkan panjang dan lebar.")
        return
    }
    val panjang = args[0].toIntOrNull() ?: return println("Panjang tidak valid.")
    val lebar = args[1].toIntOrNull()?: return println("Lebar tidak valid.")
    val pp = PersegiPanjang(panjang, lebar)
    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${pp.luas()}")
    println("Keliling: ${pp.keliling()}")
}