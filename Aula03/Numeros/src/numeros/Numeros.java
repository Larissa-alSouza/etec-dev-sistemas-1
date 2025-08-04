package numeros;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        
        int leituras, numero=0, count=0, maior=0, menor=0;
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Informe o número de leituras realizadas: ");
        leituras = teclado.nextInt();
        
        do
        {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            
            
            if(numero > maior)
            {
                maior = numero;
            }
            else
            {
                menor = numero;
            }
            
            count++;
        }while(count < leituras);
        
        System.out.println("Maior: " + maior + ". Menor: " + menor);
    }
    
}
