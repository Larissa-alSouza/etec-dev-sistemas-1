package projeto09;
import java.util.Scanner;

public class Projeto09 {

    public static void main(String[] args) {
        
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Olá, " + nome + ".");
    }
    
}
