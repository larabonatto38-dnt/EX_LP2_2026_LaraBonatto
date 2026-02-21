package Lista_matrizes;

import java.util.Scanner;

//6) Escreva um programa que receba uma matriz A(8,8) e calcule o maior elemento da sua
//diagonal principal. A seguir, o algoritmo deve dividir todos os elementos de A pelo maior
//encontrado e armazenando em uma matriz B(8,8).
public class Ex_6 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matA = new int[8][8];
        imprimir("digite os valores da matriz 8X8: ");
        lerMatriz(matA);

        int maiorA = encontrarMaior(matA);
        imprimir("\nmaior elemento da diagonal principal da matriz A: " + maiorA);

        double[][] matB = new double[8][8];
        matB = fazerMatB(matA, maiorA);

        imprimirMat(matB);
    }

    public static void imprimirMat(double[][] mat) {
        imprimir("\naqui esta a matriz B com os elementos divididos pelo maior: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] fazerMatB(int[][] matA, int maiorA) {
        //tem que ser numero com virgula pois inteiro nao mostraria se a divisao fosse pequena
        double[][] matB = new double[8][8];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                matB[i][j] = (double) matA[i][j] / maiorA;
            }
        }
        return matB;
    }

    public static int encontrarMaior(int[][] mat) {
        // diagonalPrincipal = i==j
        int maior = -1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    if (mat[i][j] > maior) {
                        maior = mat[i][j];
                    }
                }
            }
        }
        return maior;
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
