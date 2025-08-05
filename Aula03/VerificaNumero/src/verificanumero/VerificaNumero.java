package verificanumero;
import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
       
        int dado;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        
        do
        {
            boolean primo = true;
            
            System.out.print("Digite um número: ");
            dado = teclado.nextInt();
            
            //verifica se é par ou ímpar
            if(dado == 0)
            {
                break;
            }
            else if(dado % 2 == 0)
            {
                System.out.println("Par");
            }
            else if(dado % 2 != 0)
            {
                System.out.println("ímpar");
            }
            
            // verifica se é primo
            if (dado == 1) 
            {
                primo = false;
            } else 
            {
                for (int i = 2; i <= Math.sqrt(dado); i++) {
                    if (dado % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            
            
            if(primo) {
                System.out.println("É primo\n");
            } else {
                System.out.println("Não é primo\n");
            }

        }while(dado > 0);
    }
}
