package bingo;
import java.io.IOException;

public class executar_comando {
    //Apenas abre o cmd e executa um comando
    public static void cmd(String args) throws IOException, InterruptedException {
        String comando = "cmd /c start cmd.exe /wait /c "+args;
        Process cmd = Runtime.getRuntime().exec(comando);
        cmd.waitFor();
        Thread.sleep(100);
    }
}
