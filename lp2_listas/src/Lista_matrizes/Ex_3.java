package Lista_matrizes;

import java.util.Scanner;

//3) Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos elementos da sua
//diagonal secundária.
public class Ex_3 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        imprimir("digite os valores da matriz 6X6: ");
        lerMatriz(mat);

        int soma = calcularSomaElementos(mat);
        imprimir("\nsoma dos elementos da diagonal secundaria da matriz: " + soma);
    }

    public static int calcularSomaElementos(int[][] mat) {
        // elementoDiagonalSec = matriz[i][tamanho-1-i]
        int tamanhoMat = 6;
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            soma += mat[i][tamanhoMat-1-i];
        }
        return soma;
    }

    public static int[][] lerMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
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
