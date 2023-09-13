package com.rodao.bankapi.models

import com.rodao.bankapi.models.funcionarios.Autenticavel

class SistemaInterno {

    fun entrar(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem vindo ao banco!")
        } else {
            println("Falha na autenticação")
        }
    }
}