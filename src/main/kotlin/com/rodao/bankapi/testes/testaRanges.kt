fun testaRanges() {
    println("Range forma 1")
    val serie = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()
    println("Range forma 2")
    val numerosPares = 0..100 step 2
    for (par in numerosPares) {
        print("$par ")
    }

    println()
    println("Range forma 3")
    val numerosParesAte101 = 0.until(101) step 2
    for (par in numerosParesAte101) {
        print("$par ")
    }

    println()
    println("Range forma 4")
    val paresReversos = 100 downTo 0 step 2
    if (4 in paresReversos) {
        println("4 está na lista de pares reversos")
    }

    paresReversos.forEach {
        print("$it ")
    }

    println()
    println("Operações agregadores")

    val idade = intArrayOf(12, 15, 20, 32, 46, 80)
    val maiorIdade = idade.max()
    println("Maior idade = $maiorIdade")

    val menorIdade = idade.min()
    println("Menor idade = $menorIdade")

    val mediaIdade = idade.average()
    println("Média das idades = $mediaIdade")

    val todosMaiores18anos = idade.all { it > 18 }
    println("Todas idades são maiores de 18 = $todosMaiores18anos")

    val existeMaiorIdade = idade.any { it > 18}
    println("Existe maior de idade: $existeMaiorIdade")

    val filter = idade.filter { it >= 18 }
    println("Lista com maiores de 18 anos: $filter")

    val encontrarPrimeiroMaiorIgual18 = idade.find { it >= 18 }
    println("Primeiro valor maior ou igual a 18: $encontrarPrimeiroMaiorIgual18")

}