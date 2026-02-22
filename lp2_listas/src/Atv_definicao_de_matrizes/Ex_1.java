package Atv_definicao_de_matrizes;

import java.util.Scanner;

//1. Elaborar um programa em java usando métodos para determinar a matriz:
//A = [aij]n x m tal que aij = 2i + j2

public class Ex_1 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void imprimir(String text) {
        System.out.println(text);
    }

    public static int lerInt() {
        int valor = 0;
        valor = LER.nextInt();
        return valor;
    }
}