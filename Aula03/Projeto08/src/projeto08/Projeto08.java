package projeto08;
import java.util.Scanner;

public class Projeto08 {

    public static void main(String[] args) {
        
        int valor;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        valor = teclado.nextInt();
        
        System.out.println("Valor lido: " + valor);
    }
    
}
