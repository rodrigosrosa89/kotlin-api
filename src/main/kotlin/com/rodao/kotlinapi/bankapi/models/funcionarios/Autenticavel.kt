package com.rodao.kotlinapi.bankapi.models.funcionarios

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}