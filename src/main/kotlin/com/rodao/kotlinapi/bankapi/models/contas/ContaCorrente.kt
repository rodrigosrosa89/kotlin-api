package com.rodao.kotlinapi.bankapi.models.contas

import com.rodao.kotlinapi.bankapi.models.funcionarios.Cliente

class ContaCorrente(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}