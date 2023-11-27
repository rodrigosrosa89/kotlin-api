package com.rodao.kotlinapi.bankapi.testes

import com.rodao.kotlinapi.bankapi.models.contas.Conta
import com.rodao.kotlinapi.bankapi.models.contas.ContaCorrente
import com.rodao.kotlinapi.bankapi.models.contas.ContaPoupanca
import com.rodao.kotlinapi.bankapi.models.funcionarios.Cliente

fun testaObjects() {
    val clienteTotal = Cliente(nome = "ClienteTotal", cpf = "01012114588", senha = 1)
    ContaPoupanca(titular = clienteTotal, numero = 122)
    ContaCorrente(titular = clienteTotal, numero = 123)
    testaContasDiferentes()

    println()
    println("Total de contas = ${Conta.totalContas}")
}