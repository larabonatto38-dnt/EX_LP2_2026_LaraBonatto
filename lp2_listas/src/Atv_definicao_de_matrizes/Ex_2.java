package Atv_definicao_de_matrizes;

import java.util.Scanner;

//2. Elaborar um programa em java usando métodos para determinar a matriz:
//A = [aij]n x m tal que
//A = aij = {-i2, se i+j é par [...] 2ij, se i+j é impar}

public class Ex_2 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        imprimir("\ndigite a qtd de linhas da matriz A, n:");
        n = lerInt();

        imprimir("\ndigite a qtd de colunas da matriz A, m:");
        m = lerInt();

        int[][] matA = new int[n][m];

        matA = preencherMatriz(n, m, matA);

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

    public static int[][] preencherMatriz(int n, int m, int[][] matA) {
        // A = aij = {-i2, se i+j é par [...] 2ij, se i+j é impar}
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                int somaIJ = i+j;
                if (somaIJ % 2 == 0) { //par
                    matA[i][j] = (int)Math.pow(-i, 2);

                }else if (somaIJ % 2 != 0) { //impar
                    matA[i][j] = 2*i*j;
                }
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