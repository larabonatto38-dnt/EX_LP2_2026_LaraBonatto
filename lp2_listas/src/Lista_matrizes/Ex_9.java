package Lista_matrizes;

import java.util.Scanner;

//9) Escreva um programa que receba uma matriz A(10,10), e realize as seguintes trocas:
//a) a linha 2 com a linha 8;
//b) a coluna 4 com a coluna 10;
//c) a diagonal principal com a secundária;
//d) a linha 5 com a coluna 10;
//Ao final, apresente a Matriz A atualizada
public class Ex_9 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matA = new int[8][8];
        imprimir("digite os valores da matriz 8X8: ");
        matA = lerMatriz(matA);

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
