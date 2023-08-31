import com.rodao.bankapi.*

fun testaFuncionario() {

    val rodrigo = Funcionario(
        "Rodrigo",
        "09999999913",
        1000.00
    )

    println("Nome ${rodrigo.nome}")
    println("cpf ${rodrigo.cpf}")
    println("Salário ${rodrigo.salario}")
    println("Bonificação ${rodrigo.bonificacao()}")

    val mandinha = Gerente(
        "Amanda Rosa",
        "00011100022",
        2000.00,
        1234
    )

    println("Nome ${mandinha.nome}")
    println("cpf ${mandinha.cpf}")
    println("Salário ${mandinha.salario}")
    println("Bonificação ${mandinha.bonificacao()}")

    if (mandinha.autentica(1234)) {
        println("Autenticada com sucesso!")
    } else {
        println("Erro na autenticação, senha inválida")
    }

    val rafa = Diretor(
        "Rafael Koh",
        "33333333333",
        5000.00,
        12345,
        200.00
    )

    println("Nome ${rafa.nome}")
    println("cpf ${rafa.cpf}")
    println("Salário ${rafa.salario}")
    println("Bonificação ${rafa.bonificacao()}")
    println("PLR: ${rafa.plr}")

    if (rafa.autentica(12345)) {
        println("Autenticada com sucesso!")
    } else {
        println("Erro na autenticação, senha inválida")
    }

    val maria = Analista(
        "Maria",
        cpf = "98798798787",
        salario = 3000.00
    )

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(rodrigo)
    calculadoraBonificacao.registra(mandinha)
    calculadoraBonificacao.registra(rafa)
    calculadoraBonificacao.registra(maria)

    println("Total de bonitifação: ${calculadoraBonificacao.total}")

}