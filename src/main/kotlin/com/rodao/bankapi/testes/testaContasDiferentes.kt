package com.rodao.bankapi.testes

import com.rodao.bankapi.models.contas.ContaCorrente
import com.rodao.bankapi.models.contas.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Marcelo Moreno",
        numero = 9
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fábio",
        numero = 1
    )

    contaCorrente.depositar(1000.00)
    contaPoupanca.depositar(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)

    println("Saldo corrente após transferência: ${contaCorrente.saldo}")
    println("Saldo poupançaapós transferência: ${contaPoupanca.saldo}")


    contaPoupanca.transferir(100.0, contaCorrente)

    println("Saldo corrente após 2transferência: ${contaCorrente.saldo}")
    println("Saldo poupançaapós 2transferência: ${contaPoupanca.saldo}")
}
