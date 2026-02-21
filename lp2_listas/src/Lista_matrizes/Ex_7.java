package Lista_matrizes;

import java.util.Scanner;

//7) Escreva um programa que receba duas matrizes A(4,6) e B(6,4) e retorne uma matriz C, que
//seja o produto matricial de M por N.
public class Ex_7 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matA = new int[4][6];
        int[][] matB = new int[6][4];

        imprimir("digite os valores da matriz A 4X6: ");
        matA = lerMatriz(matA);

        imprimir("\ndigite os valores da matriz B 6X4: ");
        matB = lerMatriz(matB);

        
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
