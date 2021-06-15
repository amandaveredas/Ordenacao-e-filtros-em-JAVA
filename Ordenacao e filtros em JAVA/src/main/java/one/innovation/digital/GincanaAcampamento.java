package one.innovation.digital;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class GincanaAcampamento {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<String> nomeAlunos = new ArrayList<String>();
        List<Integer> numeroAlunos = new ArrayList<Integer>();

        int indiceEliminado;
        int avancos;
        int avancosPossiveis;


        while (leitor.hasNext()){
            int quantAlunos = leitor.nextInt();

            if(quantAlunos !=0){
                leitor.nextLine();

                //preenchendo as listas
                for (int i = 0; i<quantAlunos; i++){
                    String nome = leitor.next();
                    leitor.skip(" "); //pulando o espaço
                    int numero = leitor.nextInt();
                    nomeAlunos.add(nome);
                    numeroAlunos.add(numero);
                    //System.out.println(nomeAlunos.get(i) +" "+ numeroAlunos.get(i));
                    leitor.nextLine();
                }

                int indiceInicio = 0;
                int contagem = numeroAlunos.get(0);
                //System.out.println(contagem);

                for (int i=0;i<(quantAlunos-1);i++){

                    //idependente de ser par ou impar, o "cursor" irá se movimentar o resto da divisão da contagem/tamanho do array
                    avancos = contagem % nomeAlunos.size();
                    int ultimoIndice = nomeAlunos.size()-1;

                    //verifico se é par ou ímpar e identifico a posicao a ser eliminada
                    if(contagem % 2 == 0){
                        //System.out.println("é par");
                        //vai percorrer a matriz de baixo pra cima: par
                        if (indiceInicio >= avancos){
                            indiceEliminado = indiceInicio-avancos;
                        }
                        else{
                            avancosPossiveis = indiceInicio;
                            indiceEliminado = nomeAlunos.size() - (avancos - avancosPossiveis);
                        }

                    }

                    else{
                        //vai percorrer a matriz de cima pra baixo: impar

                        if (ultimoIndice-indiceInicio >= avancos){
                            indiceEliminado = indiceInicio+avancos;
                        }
                        else{

                            avancosPossiveis = avancos - (ultimoIndice - indiceInicio);
                            indiceEliminado = avancosPossiveis - 1;
                        }
                    }

                    //armazenar a posicao, o valor e remover essa linha das listas
                    contagem = numeroAlunos.get(indiceEliminado);

                    //removendo
                    numeroAlunos.remove(indiceEliminado);
                    nomeAlunos.remove(indiceEliminado);

                    //atualizando indice inicial
                    if(contagem % 2 == 0){
                        if (indiceEliminado == 0 || indiceEliminado == ultimoIndice){
                            indiceInicio = 0;
                        }

                        else{
                            indiceInicio = indiceEliminado;
                        }
                    }
                    else{
                        if (indiceEliminado == 0 || indiceEliminado == ultimoIndice){
                            indiceInicio = ultimoIndice-1;
                        }
                        else{
                            indiceInicio = indiceEliminado-1;
                        }
                    }

                }

                //
                String campeao = nomeAlunos.get(0);
                System.out.println("Vencedor(a): " + campeao);

                //limpando as listas
                nomeAlunos.clear();
                numeroAlunos.clear();
            }
        }
    }
}
