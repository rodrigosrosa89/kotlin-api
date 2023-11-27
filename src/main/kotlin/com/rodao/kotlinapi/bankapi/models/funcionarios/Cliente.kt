package com.rodao.kotlinapi.bankapi.models.funcionarios

import com.rodao.kotlinapi.bankapi.models.Endereco

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    var senha: Int,
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return senha == this.senha
    }


}