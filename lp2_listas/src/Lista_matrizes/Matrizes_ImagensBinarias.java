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

    public static int[][] preencherMatB(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[1][j] = 1;
                mat[4][j] = 1;
                mat[8][j] = 1;
            }
        }
        mat[2][7] = 1;
        mat[3][7] = 1;
        mat[1][8] = 0;
        mat[2][8] = 0;
        mat[3][8] = 0;
        return mat;

    }

    public static int[][] preencherMatC(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatD(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
            }
        }
        mat[1][8] = 0;
        mat[8][8] = 0;
        return mat;
    }

    public static int[][] preencherMatE(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[8][j] = 1;
                mat[1][j] = 1;
                mat[4][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatF(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[1][j] = 1;
                mat[4][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatG(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
                // meia linha da direita
                if (j == 8 && i >= 5)
                    mat[i][j] = 1;
                // linhazinha do miolo
                if (i == 5 && j >= 5) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;

    }

    public static int[][] preencherMatH(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[4][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatI(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][4] = 1;
                mat[i][5] = 1;
                mat[8][j] = 1;
                mat[1][j] = 1;
            }
        }
        return mat;

    }

    public static int[][] preencherMatJ(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[8][j] = 1;
                mat[i][8] = 1;
                // cabeça do J
                if (i == 1 && j >= 5) {
                    mat[i][j] = 1;
                }
                // pé do J
                mat[7][1] = 1;
            }
        }
        return mat;
    }

    public static int[][] preencherMatK(int[][] mat) {
        mat[1][7] = 1;
        mat[2][6] = 1;
        mat[3][5] = 1;
        mat[4][4] = 1;

        mat[5][4] = 1;
        mat[6][5] = 1;
        mat[7][6] = 1;
        mat[8][7] = 1;

        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][3] = 1;
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

    public static int[][] preencherMatM(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
            }
        }
        mat[4][4] = 1;
        mat[4][5] = 1;
        mat[3][3] = 1;
        mat[2][2] = 1;
        mat[3][6] = 1;
        mat[2][7] = 1;
        return mat;

    }

    public static int[][] preencherMatN(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                if (i == j) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;

    }

    public static int[][] preencherMatO(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
            }
        }
        mat[1][1] = 0;
        mat[1][8] = 0;
        mat[8][8] = 0;
        mat[8][1] = 0;
        return mat;

    }

    public static int[][] preencherMatP(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[1][j] = 1;
                mat[4][j] = 1;
                if (j == 8 && i <= 4) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;

    }

    public static int[][] preencherMatQ(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
            }
        }
        mat[6][6] = 1;
        mat[7][7] = 1;
        return mat;
    }

    public static int[][] preencherMatR(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[1][j] = 1;
                if (i == j + 2) {
                    mat[i][j] = 1;
                }
                mat[4][j] = 1;
            }
        }
        mat[2][8] = 1;
        mat[3][8] = 1;
        return mat;
    }

    public static int[][] preencherMatS(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[1][j] = 1;
                mat[8][j] = 1;
                mat[4][j] = 1;
            }
        }
        mat[2][1] = 1;
        mat[3][1] = 1;
        mat[5][8] = 1;
        mat[6][8] = 1;
        mat[7][8] = 1;
        return mat;
    }

    public static int[][] preencherMatT(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][4] = 1;
                mat[i][5] = 1;
                mat[1][j] = 1;
            }
        }
        return mat;
    }

    public static int[][] preencherMatU(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][1] = 1;
                mat[i][8] = 1;
                mat[8][j] = 1;
            }
        }
        return mat;
    }

    public static int[][] preencherMatV(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            mat[i][1] = 1;
            mat[i][8] = 1;
        }
        mat[8][4] = 1;
        mat[8][5] = 1;
        mat[7][3] = 1;
        mat[6][2] = 1;
        mat[7][6] = 1;
        mat[6][7] = 1;

        mat[8][1] = 0;
        mat[7][1] = 0;
        mat[6][1] = 0;
        mat[8][8] = 0;
        mat[7][8] = 0;
        mat[6][8] = 0;
        return mat;
    }

    public static int[][] preencherMatW(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            mat[i][1] = 1;
            mat[i][8] = 1;
        }
        mat[6][4] = 1;
        mat[6][5] = 1;
        mat[7][3] = 1;
        mat[7][6] = 1;
        mat[8][2] = 1;
        mat[8][7] = 1;

        mat[8][1] = 0;
        mat[8][8] = 0;
        return mat;
    }

    public static int[][] preencherMatX(int[][] mat) {
        int tamanho = 10;
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][tamanho - i - 1] = 1;
                if (i == j) {
                    mat[i][j] = 1;
                }
            }
        }
        return mat;
    }

    public static int[][] preencherMatY(int[][] mat) {
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][4] = 1;
                mat[i][5] = 1;
                if (i < 4) {
                    if (i == j) {
                        mat[i][j] = 1;
                    }
                }
            }
        }
        mat[1][4] = 0;
        mat[2][4] = 0;
        mat[3][4] = 0;
        mat[1][5] = 0;
        mat[2][5] = 0;
        mat[3][5] = 0;

        mat[1][8] = 1;
        mat[2][7] = 1;
        mat[3][6] = 1;
        return mat;
    }

    public static int[][] preencherMatZ(int[][] mat) {
        int tamanho = 10;
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][tamanho - i - 1] = 1;
                mat[1][j] = 1;
                mat[8][j] = 1;
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
                mat = preencherMatB(mat);
                break;

            case 'b':
                mat = preencherMatB(mat);
                break;

            case 'C':
                mat = preencherMatC(mat);
                break;

            case 'c':
                mat = preencherMatC(mat);
                break;

            case 'D':
                mat = preencherMatD(mat);
                break;

            case 'd':
                mat = preencherMatD(mat);
                break;

            case 'E':
                mat = preencherMatE(mat);
                break;

            case 'e':
                mat = preencherMatE(mat);
                break;

            case 'F':
                mat = preencherMatF(mat);
                break;

            case 'f':
                mat = preencherMatF(mat);
                break;

            case 'G':
                mat = preencherMatG(mat);
                break;

            case 'g':
                mat = preencherMatG(mat);
                break;

            case 'H':
                mat = preencherMatH(mat);
                break;

            case 'h':
                mat = preencherMatH(mat);
                break;

            case 'I':
                mat = preencherMatI(mat);
                break;

            case 'i':
                mat = preencherMatI(mat);
                break;

            case 'J':
                mat = preencherMatJ(mat);
                break;

            case 'j':
                mat = preencherMatJ(mat);
                break;

            case 'K':
                mat = preencherMatK(mat);
                break;

            case 'k':
                mat = preencherMatK(mat);
                break;

            case 'L':
                mat = preencherMatL(mat);
                break;

            case 'l':
                mat = preencherMatL(mat);
                break;

            case 'M':
                mat = preencherMatM(mat);
                break;

            case 'm':
                mat = preencherMatM(mat);
                break;

            case 'N':
                mat = preencherMatN(mat);
                break;

            case 'n':
                mat = preencherMatN(mat);
                break;

            case 'O':
                mat = preencherMatO(mat);
                break;

            case 'o':
                mat = preencherMatO(mat);
                break;

            case 'P':
                mat = preencherMatP(mat);
                break;

            case 'p':
                mat = preencherMatP(mat);
                break;

            case 'Q':
                mat = preencherMatQ(mat);
                break;
            case 'q':
                mat = preencherMatQ(mat);
                break;

            case 'R':
                mat = preencherMatR(mat);
                break;

            case 'r':
                mat = preencherMatR(mat);
                break;
            case 'S':
                mat = preencherMatS(mat);
                break;

            case 's':
                mat = preencherMatS(mat);
                break;

            case 'T':
                mat = preencherMatT(mat);
                break;

            case 't':
                mat = preencherMatT(mat);
                break;

            case 'U':
                mat = preencherMatU(mat);
                break;

            case 'u':
                mat = preencherMatU(mat);
                break;

            case 'V':
                mat = preencherMatV(mat);
                break;

            case 'v':
                mat = preencherMatV(mat);
                break;

            case 'W':
                mat = preencherMatW(mat);
                break;

            case 'w':
                mat = preencherMatW(mat);
                break;

            case 'X':
                mat = preencherMatX(mat);
                break;

            case 'x':
                mat = preencherMatX(mat);
                break;

            case 'Y':
                mat = preencherMatY(mat);
                break;

            case 'y':
                mat = preencherMatY(mat);
                break;

            case 'Z':
                mat = preencherMatZ(mat);
                break;

            default:
                mat = preencherMatZ(mat);
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
