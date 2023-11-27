package com.rodao.kotlinapi.bankapi.testes

import com.rodao.kotlinapi.bankapi.models.Endereco
import com.rodao.kotlinapi.bankapi.models.contas.ContaCorrente
import com.rodao.kotlinapi.bankapi.models.contas.ContaPoupanca
import com.rodao.kotlinapi.bankapi.models.funcionarios.Cliente

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            "Marcelo Moreno", cpf = "", senha = 1,
            endereco = Endereco(logradouro = "Rua Fernando Esquerdo")
        ),
        numero = 9
    )

    println("titular")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("endereço do titular: ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Fábio", "097112312322", senha = 2),
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

    contaCorrente.transferir(100.0, contaPoupanca, 1234)

    println("Saldo corrente após transferência: ${contaCorrente.saldo}")
    println("Saldo poupançaapós transferência: ${contaPoupanca.saldo}")


    contaPoupanca.transferir(100.0, contaCorrente, 5678)

    println("Saldo corrente após 2transferência: ${contaCorrente.saldo}")
    println("Saldo poupançaapós 2transferência: ${contaPoupanca.saldo}")
}
