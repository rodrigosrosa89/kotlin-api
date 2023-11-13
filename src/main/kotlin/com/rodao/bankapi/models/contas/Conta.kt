package com.rodao.bankapi.models.contas

import com.rodao.bankapi.exceptions.FalhaAutenticacaoException
import com.rodao.bankapi.exceptions.SaldoInsuficienteException
import com.rodao.bankapi.models.funcionarios.Autenticavel
import com.rodao.bankapi.models.funcionarios.Cliente

abstract class Conta(
    var titular: Cliente,
    var numero: Int
) : Autenticavel {

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

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, conta: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        this.saldo = this.saldo - valor
        conta.depositar(valor)
    }
}