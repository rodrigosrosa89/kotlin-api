package com.rodao.bankapi.models.funcionarios

import com.rodao.bankapi.models.Endereco

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    override val senha: Int,
) : Autenticavel {


}