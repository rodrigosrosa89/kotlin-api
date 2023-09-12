package com.rodao.bankapi.funcionarios

import com.rodao.bankapi.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int,
) : Autenticavel {


}