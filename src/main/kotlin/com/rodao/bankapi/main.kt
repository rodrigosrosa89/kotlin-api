import com.rodao.bankapi.Funcionario

fun main() {
    println("Bem vindo ao seu banco!")

    val rodrigo = Funcionario(
        "Rodrigo",
        "09999999913",
        1000.00
    )

    println("Nome ${rodrigo.nome}")
    println("cpf ${rodrigo.cpf}")
    println("Salário ${rodrigo.salario}")
    println("Bonificação ${rodrigo.bonificacao()}")
}