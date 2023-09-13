package com.rodao.bankapi.testes

import com.rodao.bankapi.models.contas.ContaCorrente
import com.rodao.bankapi.models.contas.ContaPoupanca

class testaComportamentosConta {

    fun testaComportamentosConta() {
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        val contaJoao = ContaCorrente("João", 10002)
        contaJoao.titular = "João"
        val contaMaria = ContaPoupanca("Maria", 1003)
        contaMaria.titular = "Maria"
        contaJoao.titular = "João"
    }
}