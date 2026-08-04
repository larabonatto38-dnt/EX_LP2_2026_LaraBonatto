//package Lista_matrizes;
import java.util.Scanner;

//1) Escreva um programa que receba uma matriz A(5,5) e retorne a soma dos seus elementos.
public class Ex_1 {
    
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        imprimir("digite os valores da matriz 5X5: ");
        mat = lerMatriz(mat);

        int soma = calcularSomaElementos(mat);
        imprimir("\nsoma dos elementos da matriz: " + soma);
    }

    public static int calcularSomaElementos(int [][] mat) {
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                soma += mat[i][j];
            }
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
