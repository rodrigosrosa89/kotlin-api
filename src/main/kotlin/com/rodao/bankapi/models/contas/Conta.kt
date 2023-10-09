package com.rodao.bankapi.models.contas

import com.rodao.bankapi.models.funcionarios.Cliente

abstract class Conta(
    var titular: Cliente,
    var numero: Int
) {

    var saldo = 0.0
        protected set

   companion object {
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta nova")
        totalContas++
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, conta: Conta) {
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor
            conta.depositar(valor)
        } else {
            println("Não é possível transferir valor superior ao saldo da conta.")
        }
    }
}