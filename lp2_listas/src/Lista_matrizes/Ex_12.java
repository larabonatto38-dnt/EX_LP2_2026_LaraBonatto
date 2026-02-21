package Lista_matrizes;

import java.util.Scanner;

//12) Escreva um programa que receba uma matriz A(12,12) e retorne a média aritmética dos
//elementos abaixo da diagonal principal.
public class Ex_12 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[12][12];
        imprimir("\ndigite os valores da matriz 12X12: ");
        mat = lerMatriz(mat);

        int soma = calcularSomaElementos(mat);

        int numElementos = (12*11)/2; //// (12*11)/2 = 66 elementos abaixo da diagonal
        double media = calcularMediaAritmetica(soma, numElementos);

        imprimir("\nmedia aritmetica dos elementos abaixo da diagonal principal: " + media);
    }

    public static double calcularMediaAritmetica(int soma, int numElementos) {
        double mediaAt = (double) soma / numElementos;
        return mediaAt;
    }

    public static int calcularSomaElementos(int[][] mat) {
        //abaixo da diagonal principal = linha maior que coluna (i>j)
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i>j) {
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
