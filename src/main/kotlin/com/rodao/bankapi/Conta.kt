package com.rodao.bankapi

class Conta(titular: String, numero: Int) {

    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (valor > 0) {
            saldo -= valor
        }
    }
}