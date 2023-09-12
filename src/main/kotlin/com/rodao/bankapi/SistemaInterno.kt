package com.rodao.bankapi

import com.rodao.bankapi.funcionarios.Diretor

class SistemaInterno {

    fun entrar(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem vindo ao banco!")
        } else {
            println("Falha na autenticação")
        }
    }

    fun entrar(diretor: Diretor) {

    }
}