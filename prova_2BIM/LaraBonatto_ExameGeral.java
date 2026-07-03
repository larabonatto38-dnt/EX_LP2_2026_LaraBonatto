import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaraBonatto_ExameGeral {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while (LER.hasNext()) {
            List<Integer>listaNotas = new ArrayList<>();

            int N = LER.nextInt(); //num de habitantes
            int Q = LER.nextInt(); //num de consultas

            // notas de cada cidadao
            for (int i = 0; i < N; i++) {
                listaNotas.add(LER.nextInt());
            }

            // consultas
            for (int i = 0; i < Q; i++) {
                int consultaPosicao = LER.nextInt();
                listaNotas = ordenar(listaNotas);

                // para cada caso de teste em cada consulta, imprime a nota do cidadao que ficou na posicao consultada
                System.out.println((int)listaNotas.get(consultaPosicao-1));
            }
        }
    }

    public static List<Integer> ordenar(List<Integer> listaNotas) {
        listaNotas.sort(Collections.reverseOrder()); //decrescente (maior pro menor)

        //System.out.println("pra ver se ordenou" + listaNotas);
        return listaNotas;
    }
}