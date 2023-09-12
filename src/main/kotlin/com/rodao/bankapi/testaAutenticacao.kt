import com.rodao.bankapi.Autenticavel
import com.rodao.bankapi.SistemaInterno
import com.rodao.bankapi.funcionarios.Cliente
import com.rodao.bankapi.funcionarios.Diretor
import com.rodao.bankapi.funcionarios.Gerente

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Rodrigo",
        cpf = "097998132123",
        salario = 10000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Diretor",
        cpf = "124548718848",
        salario = 20000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente("Cliente", "33333333333", 1234)

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 355)
    sistema.entrar(diretor, 2000)
    sistema.entrar(cliente, 1234)


}
