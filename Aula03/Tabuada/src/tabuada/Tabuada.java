package tabuada;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        int tabuada=0, resultado, tab, acertos=0, erros=0;
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        System.out.println("Digite um número que será multiplicado (10X): ");
        tabuada = teclado.nextInt();
       
        for(int n = 0; n < 11; n++)
        {
            tab = n * tabuada;
            
            System.out.println(n + " X " + tabuada + " = " );
            resultado = teclado.nextInt();
            
            if(resultado == tab)
            {
                System.out.println("Acertou!");
                acertos++;
            }
            else
            {
                System.out.println("Errou!");
                erros++;
            }
        }
        
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
    }
    
}
    

