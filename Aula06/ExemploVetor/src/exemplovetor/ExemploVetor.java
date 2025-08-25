package exemplovetor;
import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        
        //Entrada de dados
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Vetor [" +i +"] = ");
            vetor[i] = sc.nextInt();
        }
        
        //Saída de dados
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Vetor ["+ i + "] = " + vetor[i]);
        }
    }
    
}
