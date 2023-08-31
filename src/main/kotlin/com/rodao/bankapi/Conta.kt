package com.rodao.bankapi

open class Conta(titular: String, numero: Int) {

    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun sacar(valor: Double) {
        if (valor > 0) {
            saldo -= valor
        }
    }

    fun transferir(valor: Double, conta: Conta) {
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor
            conta.depositar(valor)
        } else {
            println("Não é possível transferir valor superior ao saldo da conta.")
        }
    }
}