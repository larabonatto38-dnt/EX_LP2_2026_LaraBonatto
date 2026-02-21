package Lista_matrizes;

import java.util.Scanner;

//5) Escreva um programa que receba uma matriz A(6,6) e retorne o menor elemento da sua
//diagonal secundária..
public class Ex_5 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        imprimir("digite os valores da matriz 6X6: ");
        lerMatriz(mat);

        int menor = encontrarMenorElemento(mat);
        imprimir("\nmenor elemento da diagonal secundaria: " + menor);
    }

    public static int encontrarMenorElemento(int[][] mat) {
        // elementoDiagonalSec = matriz[i][tamanho-1-i]
        int menor = 9999;
        int tamanho = 6;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (j == tamanho-1-i) {
                    if (mat[i][j] < menor) {
                        menor = mat[i][j];
                    }
                }
            }
        }
        return menor;
    }

    public static int[][] lerMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = lerInt();
            }
        }
        return mat;
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
