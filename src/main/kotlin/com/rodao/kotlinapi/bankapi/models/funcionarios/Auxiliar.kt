package com.rodao.kotlinapi.bankapi.models.funcionarios

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario * 0.05
    }


}