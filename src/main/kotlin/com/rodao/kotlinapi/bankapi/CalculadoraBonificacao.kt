package com.rodao.kotlinapi.bankapi

import com.rodao.kotlinapi.bankapi.models.funcionarios.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//Exemplo de ANY
//    fun registra(funcionario: Any) {
////        funcionario as Funcionario
//        if (funcionario is Funcionario) {
//            this.total += funcionario.bonificacao()
//        }
//    }


}