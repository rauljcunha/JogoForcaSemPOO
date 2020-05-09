package br.com.bootcamp.jogoforca;
import java.util.Random;
import java.util.Scanner;
public class Forca {
    public static void main(String[] args){
        System.out.println("Bem vindo ao jogo!");
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a dificuldade do jogo (F(Facil)/N(Normal)/D(Dificil)):");
        String dificuldadejogo = in.next();
        switch (dificuldadejogo){
            case "F":
                System.out.print(listaPalavrasFaceis());
                break;
            case "N":
                System.out.print(listaPalavrasNormais());
                break;
            case "F":
                System.out.print(listaPalavrasFaceis());
                break;
            default: System.out.print("Nenhuma tecla valida.");
        }
    }
    public static String listaPalavrasFaceis() {
        String[] palavras = {"banana","uva","maca"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)]
    }
    public static String listaPalavrasNormais() {
        String[] palavras = {"abacaxi","melancia","melao"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)]
    }
    public static String listaPalavrasDificeis() {
        String[] palavras = {"carambola","lichia","jatoba"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)]
    }
    }
}
