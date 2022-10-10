package bingo;

import java.io.IOException;
import java.util.Scanner;

public class mainclass {
    public static void escreva(String str)
    {
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String arquivo_local = "C:\\Testes\\";
        String arquivo = "Doc.txt";
        String escolha, resp;
        escreva("O diretório está correto?: "+arquivo_local+arquivo);
        resp = sc.nextLine();
        if (resp.charAt(0) != 's')
        {
            escreva("Digite o novo diretório sem o nome do arquivo (use \\\\ em vez de \\): ");
            arquivo_local = sc.nextLine();
            escreva("Digite o nome do arquivo com a extensão: ");
            arquivo = sc.nextLine();
        }
        escreva("Digite o que deseja fazer ->");
        escreva("Opções \n-> escrever\n-> ler");
        escolha = sc.nextLine();
        switch (escolha)
        {
            case "escrever":
                tabelas.preencher_tam();
                bingo.tabelas.preencher(arquivo_local, arquivo);
                break;
            case "ler":
                dados.ler_dados(arquivo_local, arquivo);
        }


    }
}


