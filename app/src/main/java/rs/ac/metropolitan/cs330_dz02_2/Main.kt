import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Molim Vas unesite visinu u cm:")
    val visina = scanner.nextDouble() / 100

    println("Molim Vas unesite težinu u kg:")
    val tezina = scanner.nextDouble()

    val bmi = tezina / (visina * visina)

    println("Vaš BMI je: $bmi")
}
