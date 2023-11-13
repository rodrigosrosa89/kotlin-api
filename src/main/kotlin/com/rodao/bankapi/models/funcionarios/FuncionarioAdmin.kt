package com.rodao.bankapi.models.funcionarios

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}