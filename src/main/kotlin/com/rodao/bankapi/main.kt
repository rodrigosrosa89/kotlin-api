fun main() {
    try {
        10/0
    } catch (e: ArithmeticException) {
        println("ArithmeticException foi pegada com sucesso!")
        println(e)
    }
}





