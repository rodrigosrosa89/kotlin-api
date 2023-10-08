package com.rodao.bankapi.models.funcionarios

class Cliente(
    var nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticavel {


}