import java.util.Scanner;;

public class Cod_font {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
