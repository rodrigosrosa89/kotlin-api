package com.rodao.bankapi.testes

fun testaObjects() {
    val clienteTotal = Cliente(nome = "ClienteTotal", cpf = "01012114588", senha = 1)
    ContaPoupanca(titular = clienteTotal, numero = 122)
    ContaCorrente(titular = clienteTotal, numero = 123)
    testaContasDiferentes()

    println()
    println("Total de contas = ${Conta.totalContas}")
}