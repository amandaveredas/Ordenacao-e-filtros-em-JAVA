package one.innovation.digital;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class filaBanco {
    public static void main(String[] args) {

        //recebe a quantidade de testes a seguir
        Scanner leitor = new Scanner(System.in);
        int quantTestes = leitor.nextInt();

        for (int k=0; k<quantTestes;k++){

            leitor.nextLine();

            //recebe a quantidade de clientes
            int quantClientes = leitor.nextInt();
            int cont = 0;

            //recebendo as senhas dos clientes
            List<Integer> lista = new ArrayList<Integer>();
            List<Integer> filaOrdenada = new ArrayList<Integer>();

            //preenchendo as lista
            for ( int i = 0; i < quantClientes; i++ ) {
                lista.add(leitor.nextInt());
            }
            for (int j = 0; j<quantClientes; j++){
                filaOrdenada.add(j,lista.get(j));
            }

            //ordenando a lista
            Collections.sort(filaOrdenada, Collections.reverseOrder());

            //Verificando quem não mudou de lugar
            for (int j = 0; j<quantClientes; j++){
                if (lista.get(j) == filaOrdenada.get(j)){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
