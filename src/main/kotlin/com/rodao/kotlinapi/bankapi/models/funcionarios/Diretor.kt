package com.rodao.kotlinapi.bankapi.models.funcionarios

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha), Autenticavel {

    override fun bonificacao(): Double {
        return salario + plr
    }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }

}