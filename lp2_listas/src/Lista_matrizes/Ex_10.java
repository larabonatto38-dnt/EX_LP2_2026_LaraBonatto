package Lista_matrizes;

import java.util.Scanner;

//10) Escreva um programa que receba uma matriz B(9,9) de inteiros e retorne a soma dos
//elementos das linhas pares de B.
public class Ex_10 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matB = new int[9][9];

        imprimir("\ndigite os valores da matriz 9X9: ");
        matB = lerMatriz(matB);

        int soma = calcularSomaElementosPares(matB);
        imprimir("\nsoma dos elementos das linhas pares da matriz B: " + soma);
    }

    public static int calcularSomaElementosPares(int[][] mat) {
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i % 2 == 0) { // ver se a linha e par: numero % 2 == 0
                    soma += mat[i][j];
                }
            }
        }
        return soma;
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
