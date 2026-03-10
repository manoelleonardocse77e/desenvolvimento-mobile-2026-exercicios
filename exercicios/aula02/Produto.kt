data class Produto(
    val nome: String,
    var preco: Double,
    var estoque: Int
) {

    // metodo vender
    fun vender(quant: Int) {
        if (quant <= 0) {
            println("Quantidade inválida")
            return
        }

        if (estoque >= quant) {
            estoque -= quant
            println("Venda registrada! Produto: $nome | Quantidade: $quant")
        } else {
            println("Estoque insuficiente! Estoque: $estoque | Pedido: $quant")
        }
    }

    // metodo repor
    fun repor(quant: Int) {
        if (quant <= 0) {
            println("Quantidade inválida")
            return
        }

        estoque += quant
        println("$quant unidade(s) adicionada(s) ao produto $nome")
    }

    // mostrar informações
    fun exibirInfo() {
        println("Produto: $nome | Preço: R$ $preco | Estoque: $estoque")
        println("----------------------------------------------------")
    }
}

fun main() {

    // lista de produtos
    val produtos = mutableListOf(
        Produto("Salgadinho", 5.00, 100),
        Produto("Pão", 7.00, 300),
        Produto("Brigadeiro", 3.50, 100),
        Produto("Cocada", 4.00, 75)
    )

    println("Lista de produtos:")
    produtos.forEach { it.exibirInfo() }

    println("---------------------------------")

    // testes de venda
    produtos[0].vender(40)
    produtos[1].vender(100)
    produtos[2].vender(60)

    println("---------------------------------")

    // testes de reposição
    produtos[0].repor(30)
    produtos[3].repor(15)

    println("Novo estoque:")
    produtos.forEach { it.exibirInfo() }
}
