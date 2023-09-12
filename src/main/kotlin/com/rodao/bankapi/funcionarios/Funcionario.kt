package com.rodao.bankapi.funcionarios

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    abstract fun bonificacao(): Double
}