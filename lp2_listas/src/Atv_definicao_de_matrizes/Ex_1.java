//package Atv_definicao_de_matrizes;

import java.util.Scanner;

//1. Elaborar um programa em java usando métodos para determinar a matriz:
//A = [aij]n x m tal que aij = 2i + j2

public class Ex_1 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        imprimir("\ndigite a qtd de linhas da matriz A, n:");
        n = lerInt();

        imprimir("\ndigite a qtd de colunas da matriz A, m:");
        m = lerInt();

        int[][] matA = new int[n][m];

        matA = preencherMatriz(n,m, matA);

        imprimirMatriz(matA);
    }

    public static void imprimirMatriz(int[][] mat) {
        imprimir("\naqui esta a matriz A preenchida: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] preencherMatriz(int n, int m, int[][]matA) {
        //aij = 2i + jelevado a 2
        for (int i = 0; i < matA.length; i++) { 
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = (2*i) + (int)Math.pow(j, 2);
            }
        }
        return matA;
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