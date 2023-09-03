package com.rodao.bankapi.contas

abstract class Conta(
    var titular: String,
    var numero: Int
) {

    var saldo = 0.0
        protected set

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