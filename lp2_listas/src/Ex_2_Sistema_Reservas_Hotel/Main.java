package Ex_2_Sistema_Reservas_Hotel;

import java.util.Scanner;


/*
Exercício 2: Sistema de Reservas de Hotel
Um sistema de reservas de hotel deve ser modelado. Identifique as classes conceituais,
seus atributos e associações entre elas. Considere os seguintes elementos: reserva em
hotéis de uma rede de hotéis. Cada hotel está em determinada cidade e tem um número
de quartos que estão divididas em standard e luxo. Os Hóspedes realizam reservas
informando o número de quartos e pessoas por quartos e dia de check-in e check-out.
*/

/*
Hospede --> ta dentro Reserva
Hotel --> ta dentro RedeHoteis
Quarto --> ta dentro de Hotel
RedeHoteis
Reserva --> ta dentro de Quarto
*/

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("\n...:::Sistema de Reservas de Hotel:::...\n");
        
        //objeto Hospede02
        Hospede hospede02 = new Hospede();
        hospede02.setNome("Juninho");
        hospede02.setSobrenome("das Cruzes Credos");
        hospede02.setCpf(123321456);
        hospede02.setEmail("juninGameplay@gmail.com");
        hospede02.setTelefone(998344356);

        //objeto Hotel02
        Hotel hotel02 = new Hotel();
        hotel02.setNome("HotelDurmaComOsAnjos");
        hotel02.setEndereco("Rua do Sono - 6767");
        hotel02.setCidade("Cascavel");

        //objeto quarto02
        Quarto quarto02 = new Quarto();
        quarto02.setNumeroQuarto(666);
        quarto02.setTipo("Luxo");
        quarto02.setPrecoDiaria(120);
        quarto02.setCapacidadeHospedes(999);

        //objeto redeHoteis02
        RedeHoteis redeHoteis02 = new RedeHoteis();
        redeHoteis02.setNome("HummSoninho");
        redeHoteis02.setCnpj(1234567899);

        //objeto reserva02
        Reserva reserva02 = new Reserva();
        reserva02.setCodigoReserva(128);
        reserva02.setDataCheckIn(18072010);
        reserva02.setDataCheckOut(19072010);
        reserva02.setQtdPessoas(1);
        reserva02.setQtdQuartos(1);


        //objeto hospede02 - dentro de reserva02
        reserva02.setHospede(hospede02);

        //objeto hotel02 - dentro de redeHoteis02
        redeHoteis02.setHotel(hotel02);

        //objeto quarto02 - dentro de hotel02
        hotel02.setQuarto(quarto02);

        //objeto reserva02 - dentro de quarto02
        quarto02.setReserva(reserva02);

        
        imprimir("...::TESTES::...\n");
        imprimir(hospede02.toString());
        imprimir(" ");
        imprimir(hotel02.toString());
        imprimir(" ");
        imprimir(quarto02.toString());
        imprimir(" ");
        imprimir(redeHoteis02.toString());
        imprimir(" ");
        imprimir(reserva02.toString());
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}