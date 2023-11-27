package com.rodao.kotlinapi.bankapi.testes

import com.rodao.kotlinapi.bankapi.models.contas.ContaCorrente
import com.rodao.kotlinapi.bankapi.models.contas.ContaPoupanca
import com.rodao.kotlinapi.bankapi.models.funcionarios.Cliente

fun testaComportamentosConta() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(Cliente("João", "123", senha = 123), 10002)
    val contaMaria = ContaPoupanca(Cliente("Maria", "456", senha = 456), 1003)
}