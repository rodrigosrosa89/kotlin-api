package com.rodao.kotlinapi.bankapi.testes

fun testaSalarios() {
    val salarios = doubleArrayOf(5500.50, 3000.0, 4000.50, 5000.0, 10000.0)

    val aumentoSalarial = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumentoSalarial
    }

    println("Salários com os aumentos: ${salarios.contentToString()}")
}