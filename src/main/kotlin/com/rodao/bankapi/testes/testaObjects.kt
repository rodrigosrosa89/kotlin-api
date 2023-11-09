package com.rodao.bankapi.testes

import com.rodao.bankapi.models.contas.Conta
import com.rodao.bankapi.models.contas.ContaCorrente
import com.rodao.bankapi.models.contas.ContaPoupanca
import com.rodao.bankapi.models.funcionarios.Cliente

fun testaObjects() {
    val clienteTotal = Cliente(nome = "ClienteTotal", cpf = "01012114588", senha = 1)
    ContaPoupanca(titular = clienteTotal, numero = 122)
    ContaCorrente(titular = clienteTotal, numero = 123)
    testaContasDiferentes()

    println()
    println("Total de contas = ${Conta.totalContas}")
}