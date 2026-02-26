package Lista_matrizes;

import java.util.Scanner;

/*Atividade – Construindo Letras com Imagem Binária 
Objetivo - Aplicar o conceito de como representação de imagem binária, utilizando valores 0 e 1 para construir letras no console. */
public class Matrizes_ImagensBinarias {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        imprimir("\nquantas letras você irá digitar? ");
        int qtdLetras = lerInt();

        for (int i = 0; i < qtdLetras; i++) {
            int[][] matBin = new int[10][10];

            imprimir("\ndigite a letra: ");
            char letra = LER.next().charAt(0);

            matBin = matrizAcordoLetra(matBin, letra);
            imprimiMat(matBin);
        }
    }

    public static int[][] preencherMatA(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[1][j] = 1;
                mat[i][1] = 1;
                mat[5][j] = 1;
                mat[i][8] = 1;
            }
        }
        return mat;
    }

    public static int[][] preencherMatL(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[8][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatR(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                
            }
        }
        return mat;

    }

    public static int[][] matrizAcordoLetra(int[][] mat, char letra) {
        switch (letra) {
            case 'A':
                mat = preencherMatA(mat);
                break;

            case 'a':
                mat = preencherMatA(mat);
                break;

            case 'B':

                break;

            case 'b':

                break;

            case 'C':

                break;

            case 'c':

                break;
            case 'D':

                break;
            case 'd':

                break;
            case 'E':

                break;
            case 'e':

                break;
            case 'F':

                break;
            case 'f':

                break;
            case 'G':

                break;
            case 'g':

                break;
            case 'H':

                break;
            case 'h':

                break;
            case 'I':

                break;
            case 'i':

                break;
            case 'J':

                break;
            case 'j':

                break;

            case 'K':

                break;

            case 'k':

                break;

            case 'L':
                mat = preencherMatL(mat);
                break;

            case 'l':
                mat = preencherMatL(mat);
                break;
            case 'M':

                break;
            case 'm':

                break;
            case 'N':

                break;
            case 'n':

                break;
            case 'O':

                break;
            case 'o':

                break;
            case 'P':

                break;
            case 'p':

                break;
            case 'Q':

                break;
            case 'q':

                break;
            case 'R':

                break;
            case 'r':

                break;
            case 'S':

                break;
            case 's':

                break;
            case 'T':

                break;
            case 't':

                break;
            case 'U':

                break;
            case 'u':

                break;
            case 'V':

                break;
            case 'v':

                break;
            case 'W':

                break;

            case 'w':

                break;
            case 'X':

                break;
            case 'x':

                break;
            case 'Y':

                break;
            case 'y':

                break;
            case 'Z':

                break;

            default:
                break;
        }
        return mat;
    }

    public static void imprimiMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) { // 0 desligado
                    System.out.print("◼️ ");
                } else { // 1 ligado
                    System.out.print("◻️ ");
                }
            }
            System.out.println();
        }
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
