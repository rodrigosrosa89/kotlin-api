package com.rodao.bankapi.models.funcionarios

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticavel {


}