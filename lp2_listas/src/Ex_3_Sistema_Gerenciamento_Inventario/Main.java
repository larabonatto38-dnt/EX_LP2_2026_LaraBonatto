import java.util.Scanner;

/*
Exercício 3: Sistema de Gerenciamento de Inventário
Você está desenvolvendo um sistema para gerenciar os pedidos de compra de uma
loja. Identifique as classes conceituais, seus atributos e associações entre elas.
Considere os seguintes elementos: A loja vende produtos separados por categorias.
Cada produto possui um fornecedor. E clientes fazem pedidos de compra.
*/

/*
Categoria --> produto tem uma Categoria
Cliente --> faz um Pedido
Fornecedor --> fornece um Produto
Pedido --> o Cleinte faz
Produto --> esta dentro do Pedido que o cliente fez
*/

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("\n...:::Sistema de Gerenciamento de Inventário:::...\n");
        
        //objeto categoria03
        Categoria categoria03 = new Categoria();
        categoria03.setIdCategoria(033);
        categoria03.setNome("Categoria03");
        categoria03.setDescricao("Categoria para produtos denominados 'tranqueirinhas'");

        //objeto cliente03
        Cliente cliente03 = new Cliente();
        cliente03.setIdCliente(333);
        cliente03.setNome("Nicolau");
        cliente03.setEmail("NicolauTerceiro@gmail.com");
        cliente03.setTelefone(12345678);
        cliente03.setEndereco("Rua dos Nicolas - 1212");

        //objeto fornecedor03
        Fornecedor fornecedor03 = new Fornecedor();
        fornecedor03.setIdFornecedor(0003);
        fornecedor03.setNomeEmpresa("Tranqueiras.Com");
        fornecedor03.setCnpj(12344444);
        fornecedor03.setTelefone(132232323);

        //objeto pedido03
        Pedido pedido03 = new Pedido();
        pedido03.setIdPedido(893);
        pedido03.setDataPedido(22012026);
        pedido03.setStatus(false);
        pedido03.setValorTotal(120);

        //objeto produto03
        Produto produto03 = new Produto();
        produto03.setIdProduto(030303);
        produto03.setNome("Segurador de colher de gatinho preto de cartola e bigodes humanos");
        produto03.setPreco(99);
        produto03.setQuantidadeEstoque(2);
        
        // setar categoria do produto
        produto03.setCategoriaProduto(categoria03);

        // setar produto fornecido
        fornecedor03.setProdutoFornecido(produto03);

        // setar pedido cliente
        cliente03.setPedidoCliente(pedido03);

        // setar quem e o clientePidao e setar qual produto ele pediu
        pedido03.setClientePidao(cliente03);
        pedido03.setProdutoPedidoCliente(produto03);


        imprimir("...::TESTES::...\n");
        imprimir(" ");
        imprimir(categoria03.toString());
        imprimir(" ");
        imprimir(cliente03.toString());
        imprimir(" ");
        imprimir(fornecedor03.toString());
        imprimir(" ");
        imprimir(pedido03.toString());
        imprimir(" ");
        imprimir(produto03.toString());
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}