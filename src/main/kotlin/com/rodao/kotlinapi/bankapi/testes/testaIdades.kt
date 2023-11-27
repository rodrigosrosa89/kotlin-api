package com.rodao.kotlinapi.bankapi.testes

fun testaIdades() {
    val idades = IntArray(5)
    idades[0] = 22
    idades[1] = 33
    idades[2] = 25
    idades[3] = 54
    idades[4] = 43

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("A maior idade dentro da lista IntArray é  $maiorIdade")
}

fun testaIdades2() {
    val idades = intArrayOf(22, 33, 25, 54, 43)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("A maior idade dentro da lista intArrayOf é  $maiorIdade")
}

fun testaIdadesMenor() {
    val idades = intArrayOf(22, 33, 25, 54, 43)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->(
        if (idade < menorIdade) {
            menorIdade = idade
        })
    }

    println("A menor idade dentro da lista intArrayOf com forEach é $menorIdade")
}