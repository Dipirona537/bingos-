package bingo;
import java.io.File;
import java.io.IOException;

public class existente {
    //Classe teste se arquivo existe, caso não existir a mesma cria um arquivo no diretorio selecionado.
    public static void existe(String arquivo_local, String arquivon) throws IOException, InterruptedException {
        File arquivo = new File(arquivo_local+arquivon);
        if (!arquivo.exists())
        {
            nao_existe(arquivo_local, arquivon);
        }
    }
    public static void nao_existe(String arquivo_local, String arquivo) throws IOException, InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("------------Arquivo não encontrado! criando diretório e arquivo em "+arquivo_local+arquivo+"...------------");
        System.out.println("---------------------------------------------------------------------------------------------------");
        executar_comando.cmd("mkdir "+arquivo_local);
        String dir = arquivo_local+arquivo;
        executar_comando.cmd("type nul > "+dir);
        bingo.dados.escrever_dados("PREENCHIMENTO DA TABELA", arquivo_local, arquivo, true);
    }
}