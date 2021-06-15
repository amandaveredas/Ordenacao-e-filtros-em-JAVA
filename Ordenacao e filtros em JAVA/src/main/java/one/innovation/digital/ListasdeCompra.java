package one.innovation.digital;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.AbstractCollection;

public class ListasdeCompra {
    public static void main(String[] args) {

        //recebe numero de listas
        Scanner leitor = new Scanner(System.in);
        int numeroDeListas = leitor.nextInt();

        //recebendo as listas
        String lista = new String();
        Set<String> listaOrganizada = new TreeSet<>();

        leitor.nextLine();//pulando a linha

        while (leitor.hasNextLine()){
            listaOrganizada.clear(); //limpando o hashSet
            lista = leitor.nextLine();
            StringTokenizer item = new StringTokenizer(lista);
            while (item.hasMoreTokens()){
                listaOrganizada.add(item.nextToken());
            }

            for (String s : listaOrganizada) {
                System.out.print(s + " ");
            }
            System.out.println();
        }


    }
}
