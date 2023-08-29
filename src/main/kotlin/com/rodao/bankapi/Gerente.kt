package com.rodao.bankapi

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

}