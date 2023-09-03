package com.rodao.bankapi

import com.rodao.bankapi.contas.ContaCorrente
import com.rodao.bankapi.contas.ContaPoupanca

class testaCopiasEReferencias {

    fun testaCopiasEReferencias() {
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        var contaJoao = ContaCorrente("João", 10002)
        contaJoao.titular = "João"
        var contaMaria = ContaPoupanca("Maria", 1003)
        contaMaria.titular = "Maria"
        contaJoao.titular = "João"
    }
}