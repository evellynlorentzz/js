import java.io.FileWriter;
import java.io.PrintWriter;
import  java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Evellyn Victoria Sousa Lorentz
 */
public class Main {
     public static void main(String[] args) {
        Cachorro cachorro = new Cachorro ("Snoop",5);
        System.out.println("Informaçoes do Cachorro: ");
        cachorro.exibirInformacoes();
        cachorro.fazersom();
        System.out.println("|--------------------------------|");
        
        Gato gato = new Gato("Garfild",3);
        System.out.println("Informaçoes da Gato: ");
        gato.exibirInformacoes();
        gato.fazersom();
        System.out.println("|------------------------|");
        
        Passaro passaro = new Passaro("Calopsita",1);
        System.out.println("Informaçoes do Passaro: ");
        passaro.exibirInformacoes();
        passaro.fazersom();
        System.out.println("|------------------------|");
        
       try {
            FileWriter arquivo = new  FileWriter ("informacoesDS1B.txt", true);
            PrintWriter gravarArquivo = new PrintWriter (arquivo);
            
            String iCachorro           = ("| Nome: Snoop. Idade: 18         | ");
             String sCachorro          = ("|O cachorro está latindo : auau! | ");
             gravarArquivo.println("|--------------------------------|");
             gravarArquivo.println("| informacoes do cachorro        |");
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println(iCachorro);
             gravarArquivo.println(sCachorro);
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println();
                      
                         String iiCachorro = ("║    Nome: Snoop. Idade: 18          ║ ");
                         String ssCachorro = ("║   O cachorro está latindo : auau!  ║");
             gravarArquivo.println("╔════════════════════════════════════╗");
                         gravarArquivo.println("║       informacoes do cachorro      ║");
                         gravarArquivo.println("╠════════════════════════════════════╣"); 
                       gravarArquivo.println(iiCachorro);
                      gravarArquivo.println(ssCachorro);
                              gravarArquivo.println("╚════════════════════════════════════╝"); 
                      gravarArquivo.println();
            
                      
                         String iGato           = ("| Nome: Garfield. I dade: 3      | ");
             String sGato          = ("|O Gato está miando : miau!      | ");
             gravarArquivo.println("|--------------------------------|");
             gravarArquivo.println("| informacoes do gato            |");
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println(iGato);
             gravarArquivo.println(sGato);
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println();
                  String iiGato = ("║    Nome: Garfield. Idade: 3        ║ ");
                         String ssGato = ("║   O gato esta miando : miau!       ║");
             gravarArquivo.println("╔════════════════════════════════════╗");
                         gravarArquivo.println("║       informacoes do Gato          ║");
                         gravarArquivo.println("╠════════════════════════════════════╣"); 
                       gravarArquivo.println(iiGato);
                      gravarArquivo.println(ssGato);
                              gravarArquivo.println("╚════════════════════════════════════╝"); 
                      gravarArquivo.println();
                      
                               String iPassaro          = ("| Nome: calopsita. I dade: 1     | ");
             String sPassaro          = ("|O Passaro está piando : piu!    | ");
             gravarArquivo.println("|--------------------------------|");
             gravarArquivo.println("| informacoes do Passaro         |");
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println(iPassaro);
             gravarArquivo.println(sPassaro);
             gravarArquivo.println("|--------------------------------|"); 
             gravarArquivo.println();
                  String iiPassaro = ("║    Nome: Calopsita. Idade: 1       ║ ");
                  String ssPassaro = ("║   O passaro esta piando : piu!     ║");
             gravarArquivo.println("╔════════════════════════════════════╗");
                         gravarArquivo.println("║       informacoes do passaro       ║");
                         gravarArquivo.println("╠════════════════════════════════════╣"); 
                       gravarArquivo.println(iiPassaro);
                      gravarArquivo.println(ssPassaro);
                              gravarArquivo.println("╚════════════════════════════════════╝"); 
                      gravarArquivo.println();
                      gravarArquivo.close(); //finaliza o arquivo
                      
                      System.out.println("Gravado com sucesso no aqruivo!");
          
        } catch (IOException e) {
            System.out.println("ocorreu um erro ao salvar o aquivo");
            e.printStackTrace ();
        }
    }
}

            
        
    

