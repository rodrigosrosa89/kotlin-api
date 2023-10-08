package com.rodao.bankapi.models.contas

import com.rodao.bankapi.models.funcionarios.Cliente

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}