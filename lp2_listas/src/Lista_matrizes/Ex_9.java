//package Lista_matrizes;

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
        int[][] mat = new int[10][10];
        imprimir("\ndigite os valores da matriz 10X10: ");
        mat = lerMatriz(mat);

        mat = realizarTrocaA(mat);
        mat = realizarTrocaB(mat);
        mat = realizarTrocaC(mat);
        mat = realizarTrocaD(mat);

        imprimirMat(mat);
    }

    public static int[][] realizarTrocaD(int[][] mat) {
        // d) a linha 5 com a coluna 10;
        int[] vetL5 = guardarLinha(mat, 5);
        int[] vetC10 = guardarColuna(mat, 9);

        for (int i = 0; i < mat.length; i++) {
            mat[5][i] = vetC10[i];
            mat[i][9] = vetL5[i];
        }
        return mat;
    }

    public static int[][] realizarTrocaC(int[][] mat) {
        // c) a diagonal principal com a secundária;
        int tamanho = 10;
        int[] vetPrincipal = guardarPrincipal(mat);
        int[] vetSecundaria = guardarSecundaria(mat);


        for (int i = 0; i < vetSecundaria.length; i++) {
            mat[i][tamanho - 1 - i] = vetPrincipal[i];
        }

        int cont = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mat[i][j] = vetSecundaria[cont];
                    cont++;

                }
            }
        }
        return mat;
    }

    public static int[] guardarSecundaria(int[][] mat) {
        int[] vet = new int[10];
        int tamanho = 10;
        int posicao = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == tamanho - 1 - i) {
                    vet[posicao] = mat[i][j];
                    posicao++;
                }
            }
        }
        return vet;
    }

    public static int[] guardarPrincipal(int[][] mat) {
        int[] vet = new int[10];
        int posicao = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    vet[posicao] = mat[i][j];
                    posicao++;
                }
            }
        }
        return vet;
    }

    public static int[][] realizarTrocaB(int[][] mat) {
        // b) a coluna 4 com a coluna 10;
        int[] vetC4 = guardarColuna(mat, 4);
        int[] vetC10 = guardarColuna(mat, 9);

        for (int i = 0; i < mat.length; i++) {
            mat[i][4] = vetC10[i];
            mat[i][9] = vetC4[i];
        }
        return mat;
    }

    public static int[][] realizarTrocaA(int[][] mat) {
        // a) a linha 2 com a linha 8;
        int[] vetL2 = guardarLinha(mat, 2);
        int[] vetL8 = guardarLinha(mat, 8);

        for (int j = 0; j < mat.length; j++) {
            mat[2][j] = vetL8[j];
            mat[8][j] = vetL2[j];
        }
        return mat;
    }

    public static int[] guardarColuna(int[][] mat, int qualColuna) {
        int[] vet = new int[10];
        int posicao = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == qualColuna) {
                    vet[posicao] = mat[i][j];
                    posicao++;
                }
            }
        }
        return vet;
    }

    public static int[] guardarLinha(int[][] mat, int qualLinha) {
        int[] vet = new int[10];
        int posicao = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == qualLinha) {
                    vet[posicao] = mat[i][j];
                    posicao++;
                }
            }
        }
        return vet;
    }

    public static void imprimirMat(int[][] mat) {
        imprimir("\naqui esta a matriz com as 4 trocas feitas: ");
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
