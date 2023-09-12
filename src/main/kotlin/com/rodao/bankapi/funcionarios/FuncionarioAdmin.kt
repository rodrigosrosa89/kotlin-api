package com.rodao.bankapi.funcionarios

import com.rodao.bankapi.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}