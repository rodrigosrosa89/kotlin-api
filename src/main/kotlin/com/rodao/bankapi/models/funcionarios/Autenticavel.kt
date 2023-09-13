package com.rodao.bankapi.models.funcionarios

interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}