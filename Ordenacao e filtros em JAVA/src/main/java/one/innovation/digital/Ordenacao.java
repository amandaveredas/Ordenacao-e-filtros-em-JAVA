package one.innovation.digital;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int quantNumeros = leitor.nextInt();
        List<Integer> par = new ArrayList<Integer>(quantNumeros);
        List<Integer> impar = new ArrayList<Integer>(quantNumeros);
        int i = 0;
        int j = 0;
        int k = 0;


        //separando em pares e ímpares
        for (i=0; i<quantNumeros;i++){
            int numero = leitor.nextInt();
            if (numero%2 == 0) {
                par.add(numero);}
            else impar.add(numero);

        }

        //ordenando as duas listas
        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);


        for (j=0; j<par.size(); j++){
            System.out.println(par.get(j));
        }

        for (k=0; k<impar.size(); k++){
            System.out.println(impar.get(k));
        }


    }
}
