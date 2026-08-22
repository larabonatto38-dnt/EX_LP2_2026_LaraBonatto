import java.util.Scanner;

/*
Exercício 5: Sistema de Vendas de Ingressos para Cinema
Você foi contratado para modelar um sistema de vendas de ingressos para um cinema
que possui diversas salas de projeção com cadeiras numeradas. Identifique as classes
conceituais, seus atributos e associações entre elas. Considere os seguintes elementos:
O cinema possui diversas salas. Cada sala exibe um filme em diversos horários
(sessões). Cada sala possui uma capacidade. Clientes compram ingressos para
determinado filme e determinada sessão escolhendo as cadeiras que são numeradas.
*/

/*
Cadeira - ta dentro da sala
Cinema - dentro tem uma sala
Cliente - compra um ingresso
Filme- ta dentro da sessao
Ingresso - ta dentro da sessao
Sala - tem cadeira e tem sessao
Sessao - tem dentro o filme e o ingresso
*/

public class Teste05 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("\n...:::Sistema de Vendas de Ingressos para Cinema:::...\n");

        //objeto cadeira05
        Cadeira cadeira05 = new Cadeira();
        cadeira05.setLetraCadeira("A");
        cadeira05.setNumeroCadeira(1);
        cadeira05.setStatus("Livre");

        //objeto cinema05
        Cinema cinema05 = new Cinema();
        cinema05.setNome("Filmelex");
        cinema05.setCnpj(12345432);
        cinema05.setEndereco("Rua das paixoes - 2021");
        cinema05.setTelefone(97654345);

        //objeto cliente05
        Cliente cliente05 = new Cliente();
        cliente05.setNome("Ana");
        cliente05.setSobrenome("Banana");
        cliente05.setCpf(9876567);
        cliente05.setEmail("aninhaBananinha@gmail.com");
        cliente05.setTemCadastro(true);

        //objeto filme05
        Filme filme05 = new Filme();
        filme05.setTitulo("Bananas de Pijama");
        filme05.setDuracao(120);
        filme05.setGenero("Infantil");
        filme05.setFaixaEtaria("Maiores de 5 anos");
        filme05.setSinopse("Live action do desenho infatil 'bananas de pijama'");

        //objeto ingresso05
        Ingresso ingresso05 = new Ingresso();
        ingresso05.setCodigo(0505);
        ingresso05.setPrecoPago(15);
        ingresso05.setDataEmissao(22082017);
        ingresso05.setHoraEmissao(16);

        //objeto sala05
        Sala sala05 = new Sala();
        sala05.setNumero(5);
        sala05.setCapacidadeTotal(60);

        //objeto sessao05
        Sessao sessao05 = new Sessao();
        sessao05.setData(22082017);
        sessao05.setHorarioInicio(17);


        // setar sala no cinema05
        cinema05.setSala01(sala05);

        // setar ingressoComprado do cliente05
        cliente05.setIngressoComprado(ingresso05);

        // setar cadeira sala05
        sala05.setCadeirasSala(cadeira05);

        // setar sessao sala05
        sala05.setSessaoSala(sessao05);
        
        // setar filme sessao05
        sessao05.setFilmeSessao(filme05);

        // setar ingresso sessao05
        sessao05.setIngressoSessao(ingresso05);
        
        imprimir("...::TESTES::...\n");
        imprimir(" ");
        imprimir(cadeira05.toString());
        imprimir(" ");
        imprimir(cinema05.toString());
        imprimir(" ");
        imprimir(cliente05.toString());
        imprimir(" ");
        imprimir(filme05.toString());
        imprimir(" ");
        imprimir(ingresso05.toString());
        imprimir(" ");
        imprimir(sala05.toString());
        imprimir(" ");
        imprimir(sessao05.toString());
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }

    public static Scanner getLer() {
        return LER;
    }
}