import java.util.Scanner;

/*
Exercício 4: Sistema de Registro de Pacientes em Hospital
Você precisa modelar um sistema de registro de pacientes para um hospital. Identifique
as classes conceituais, seus atributos e associações considerando: Pacientes são
internados em quartos. Para cada paciente internado há um médico responsável.
Durante o período de internamento o médico responsável define os medicamentos e
horários que devem ser administrados. A pessoa responsável pela administração dos
medicamentos é a enfermeira.
*/

public class Main {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimir("\n...:::Sistema de Registro de Pacientes em Hospital:::...\n");
        

        
        imprimir("...::TESTES::...\n");
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }
}