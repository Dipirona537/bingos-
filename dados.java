package bingo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class dados {
    //Escreve as coisas no arquivo especificado
    public static void escrever_dados(String dados, String arquivo_local, String arquivo, boolean append) throws IOException {
        String dir = arquivo_local+arquivo;
        FileOutputStream outputStream = new FileOutputStream(dir, append);
        byte[] dados_b = (dados.getBytes());
        outputStream.write(dados_b);
    }

    //Le as linhas do arquivo
    public static void ler_dados(String arquivo_local, String arquivon) throws IOException {
        FileReader fr = new FileReader(arquivo_local+arquivon);
        int i;
        while ((i= fr.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}
