//package Lista_matrizes;

import java.util.Scanner;

//13) Escreva um programa que receba uma matriz A(10,10) e retorne a soma dos elementos acima
//da diagonal principal.
public class Ex_13 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[10][10];

        imprimir("\ndigite os valores da matriz A 10X10: ");
        mat = lerMatriz(mat);

        int soma = calcularSomaElementos(mat);

        imprimir("\nsoma dos elementos acima da diagonal principal: " + soma);
    }

    public static int calcularSomaElementos(int[][] mat) {
        //acima da diagonal principal = linha menor que coluna (i<j)
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i<j) {
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
