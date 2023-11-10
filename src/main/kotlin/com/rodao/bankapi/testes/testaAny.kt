import com.rodao.bankapi.models.Endereco

fun testaAny() {
    val endereco = Endereco(numero = 1000)
    endereco.logradouro = "Rua xxx"
    val enderecoNovo = Endereco(bairro = "Gutierrez", complemento = "Ap303")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())

}