//package Lista_matrizes;

import java.util.Scanner;

//7) Escreva um programa que receba duas matrizes A(4,6) e B(6,4) e retorne uma matriz C, que
//seja o produto matricial de M por N.
public class Ex_7 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matC = new int[4][4];
        imprimir("\ndigite o tamanho da matriz A(i e j): ");
        int tamanhoAI = lerInt();
        int tamanhoAJ = lerInt();
        int[][] matA= new int[tamanhoAI][tamanhoAJ];

        imprimir("\ndigite o tamanho da matriz B(i e j): ");
        int tamanhoBI = lerInt();
        int tamanhoBJ = lerInt();
        int[][] matB= new int[tamanhoBI][tamanhoBJ];

        imprimir("\ndigite os valores da matriz A: ");
        matA = lerMatriz(matA); 

        imprimir("\ndigite os valores da matriz B: ");
        matB = lerMatriz(matB);

        matC = multiplicarMatrizes(matA, matB, tamanhoAI, tamanhoBJ);

        imprimirMatriz(matC);
    }

    public static int[][] multiplicarMatrizes(int[][] A, int[][] B, int tamanhoAI, int tamanhoBJ) {
        int[][] C = new int[tamanhoAI][tamanhoBJ];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                } 
            }
        }
        return C;
    }

    public static void imprimirMatriz(int[][] mat) {
        imprimir("\naqui esta a matriz C: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
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
