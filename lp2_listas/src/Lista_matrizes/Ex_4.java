package Lista_matrizes;

import java.util.Scanner;

//4) Escreva um programa que receba uma matriz A(7,6) e retorne a soma dos elementos da linha
//5 e da coluna 3.
public class Ex_4 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[7][6];
        imprimir("digite os valores da matriz 7X6: ");
        lerMatriz(mat);

        int soma = calcularSomaElementos(mat);
        imprimir("\nsoma dos elementos da linha 5 e da coluna 3 da matriz: " + soma);
    }

    public static int calcularSomaElementos(int[][] mat) {
        // linha5[i==5][j]
        // coluna3[i][j==3]
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i==5 || j==3) {
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
