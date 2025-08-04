package adivinhacao;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        
        int segredo, numero, tentativas=0;   
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do segredo: ");
        segredo = teclado.nextInt();
        
        do
        {
            System.out.println("Digite seu palpite: ");
            numero = teclado.nextInt();
            tentativas++;
        } while(numero != segredo);
        
        System.out.println("A quantidade de tentativas foram: " + tentativas);
    }
    
}
