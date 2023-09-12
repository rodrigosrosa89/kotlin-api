package com.rodao.bankapi.funcionarios

import com.rodao.bankapi.Autenticavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha),
    Autenticavel {

    override fun bonificacao(): Double {
        return salario
    }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}