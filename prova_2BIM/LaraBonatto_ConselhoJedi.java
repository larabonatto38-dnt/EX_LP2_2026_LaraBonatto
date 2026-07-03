import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaraBonatto_ConselhoJedi {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        while(LER.hasNext()){
        int N = LER.nextInt(); // qtd jovens q fizeram o teste
        int K = LER.nextInt(); // qtd de candidatos q serao destacados

        List<Integer> listaN = new ArrayList<>(); // lista com as N pontuacoes dos candidatos

        // le as pontuacoes
        for (int i = 0; i < N; i++) {
            listaN.add(LER.nextInt());
        }

        // ordena as pontuacoes em ordem decrescente
        listaN = ordenar(listaN);

        // imprime apenas os K maiores valores
        for (int i = 0; i < K; i++) {
            System.out.print(listaN.get(i) + " ");
        }

        // so pra separar
        System.out.println();
        }
    }

    public static List<Integer> ordenar(List<Integer> listaN) {
        listaN.sort(Collections.reverseOrder()); //decrescente (maior pro menor)

        //System.out.println("pra ver se ordenou" + listaN);
        return listaN;
    }
}