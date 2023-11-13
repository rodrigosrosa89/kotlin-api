package com.rodao.bankapi.models.funcionarios

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}