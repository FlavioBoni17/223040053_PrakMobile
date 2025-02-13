class IndeksNilaiMatkul(private val nilai: Int) {
    fun hitungIndeks(): String {
        return when {
            nilai in 80..100 -> "A"
            nilai in 70..79 -> "AB"
            nilai in 60..69 -> "B"
            nilai in 50..59 -> "BC"
            nilai in 40..49 -> "C"
            nilai in 30..39 -> "D"
            nilai in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Nilai harus diisi")
        return
    }
    
    val nilai = args[0].toIntOrNull()
    if (nilai == null) {
        println("Nilai harus diisi")
        return
    }
    
    val indeksNilai = IndeksNilaiMatkul(nilai)
    println("Input: $nilai")
    println("Output: ${indeksNilai.hitungIndeks()}")
}