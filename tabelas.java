package bingo;

import java.io.IOException;
import java.util.Scanner;

public class tabelas {

    //Tamanho das proporcoes de cada tabela
    static int propi;
     static int propj;
    static int tam;
    static int valor;

    //Preenche o tamanho da tabela
    public static void preencher_tam(){
        tam = quantidade("Digite quantas tabelas irá preencher: ")-1;
        propi = quantidade("Digite a quantidade de linhas da tabela: ");
        propj = quantidade("Digite a quantidade de colunas da tabela: ");
    }

    public static void escreva(String str)
    {
        System.out.println(str);
    }

    //Serve para definir quantidade de uma variavel
    public static int quantidade(String texto){
        Scanner sc = new Scanner(System.in);
        escreva(texto);
        String str = sc.nextLine();
        //escreva(String.valueOf(n));
        return checar_quantidade(str);
    }
    //Checa se a quantidade e um inteiro
    public static int checar_quantidade(String n)
    {
        String alfabeto = "ÃãÁáÀàÂâabcdÉéÈèÊêefghÍíÎîijklmnÔôÕõÓòÓóopqrstÚúùÙûÛuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ´`[{]}~^;:.,<>/?'!@#$%&*()-+ ";
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<n.length();i++)
        {
            for (int j = 0;j<alfabeto.length();j++)
            {
                if (n.charAt(i) == alfabeto.charAt(j))
                {
                    escreva("O número digitado não é valido!, digite novamente: ");
                    n = sc.nextLine();
                    i = 0;
                    j = 0;
                }
            }
        }
        return Integer.parseInt(n);
    }

    //Preenche os dados da tabela
    public static void preencher(String arquivo_local, String arquivo) throws IOException, InterruptedException {
        bingo.existente.existe(arquivo_local, arquivo);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabelas.tam + 1; i++) {
            escreva("Digite o nome do comprador da tabela " + i + ", use N para tabela sem comprador: ");
            String nome = sc.nextLine();
            if (nome.equals("N")) {
                nome = "TABELA NÃO COMPRADA";
            }
            bingo.dados.escrever_dados("\n"+ nome + " "+"\n", arquivo_local, arquivo, true);
            for (int lin = 0; lin < tabelas.propi; lin++) {
                for (int col = 0; col < tabelas.propj; col++) {
                    valor = quantidade("Digite o valor em " + lin + " " + col);
                    bingo.dados.escrever_dados(" "+ lin, arquivo_local, arquivo, true);
                    bingo.dados.escrever_dados(" " + col, arquivo_local, arquivo, true);
                    bingo.dados.escrever_dados(" = ", arquivo_local, arquivo, true);
                    bingo.dados.escrever_dados(Integer.toString(valor), arquivo_local, arquivo, true);
                    bingo.dados.escrever_dados("\n", arquivo_local, arquivo, true);

                }
            }
        }
    }
}
