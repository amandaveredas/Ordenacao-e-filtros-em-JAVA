package one.innovation.digital;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Uniformes {
    public static void main(String[] args) {

        //recebe a quantidade de uniformes
        Scanner leitor = new Scanner(System.in);
        int quantAlunos = leitor.nextInt();

        //recebendo os dados dos alunos
        String aluno = new String();
        String cor = new String();
        String tamanho = new String();
        List<String> lista = new ArrayList<>();
        String linha = new String();

        leitor.nextLine();
        for ( int i = 0; i < quantAlunos; i++ ) {
            aluno = leitor.nextLine();
            StringTokenizer st = new StringTokenizer(leitor.nextLine());
            cor = st.nextToken();
            tamanho = st.nextToken();
            lista.add(cor + " " + tamanho + " " + aluno);
        }
        //System.out.println(lista);

        //usando streams para ordenar
        String listaOrdenada = lista.stream()
                .sorted(Comparator.comparing(s1 -> s1.toString().substring(0,s1.toString().indexOf(32)))
                        .thenComparing(s1 -> s1.toString().substring(s1.toString().indexOf(32)+1, s1.toString().indexOf(32, s1.toString().indexOf(32)+1)), Comparator.reverseOrder())
                        .thenComparing(s1 -> s1.toString().substring(2)))
                .collect(Collectors.joining("\n"));

        System.out.println(listaOrdenada);

    }
}
