import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
    
    public static void lerArquivo(){
        try{
            BufferedReader leitorArquivo = new BufferedReader(new FileReader("ConteudoDosCapitulos.txt"));
            String linha;
            while((linha = leitorArquivo.readLine()) != null){
                System.out.println(linha);
            }
            leitorArquivo.close();
        
        }catch(IOException e){
            System.out.println("Erro ao tentar ler o arquivo" + e.getMessage());
        } 
    }
}
