package com.rodao.bankapi

interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}