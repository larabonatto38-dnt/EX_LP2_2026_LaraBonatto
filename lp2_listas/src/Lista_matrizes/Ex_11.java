package Lista_matrizes;

import java.util.Scanner;

//11) Escreva um programa que receba uma matriz A(6,6) e multiplique cada linha pelo elemento
//da diagonal principal daquela linha. O procedimento deve retornar a matriz alterada.
public class Ex_11 {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matA = new int[6][6];
        int[] diagPrinc = new int[6];
        int[][] matAlterada = new int[6][6];

        imprimir("\ndigite os valores da matriz A 6X6: ");
        matA = lerMatriz(matA);

        diagPrinc = encontrarDiagonalPrincipal(matA);

        matAlterada = fazerMatriz(matA, diagPrinc);
        
        imprimirMat(matAlterada);
    }

    public static void imprimirMat(int[][] mat) {
        imprimir("\naqui esta a matriz alterada com os elementos multiplicados pelo elemento da diagonal principal de respectiva linha: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] fazerMatriz(int[][]mat, int[] diagPrinc) {
        int[][] matAlterada = new int[6][6];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matAlterada[i][j] = mat[i][j] * diagPrinc[i];
            }
        }
        return matAlterada;
    }

    public static int[] encontrarDiagonalPrincipal(int[][]mat) {
        int[] vet = new int[6];
        int posicao =0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (i==j) {
                    vet[posicao] = mat[i][j];
                    posicao++;
                }
            }
        }
        return vet;
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
