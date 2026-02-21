package Lista_matrizes;

import java.util.Scanner;

//8) Escreva um programa que receba uma matriz M(6,6) e um valor A . O procedimento deve
//multiplicar cada elemento de M por A e armazenar em um vetor V(36).
public class Ex_8 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matM = new int[6][6];
        int A = 0;
        int[] vetorV = new int[36];

        imprimir("\ndigite os valores da matriz M 6X6: ");
        matM = lerMatriz(matM);

        imprimir("\ndigite o valor A: ");
        A = lerInt();

        vetorV = calcularVet(matM, A);
        imprimirVetor(vetorV);
    }

    public static void imprimirVetor(int[] vet) {
        imprimir("\naqui esta o vetor V: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "] ");
        }
    }

    public static int[] calcularVet(int[][] M, int A) {
        int[] vetorV = new int[36];
        int posicao = 0; //evitar sobrescrever o vetor
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                vetorV[posicao] = M[i][j] * A;
                posicao++;
            }
        }
        return vetorV;
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
