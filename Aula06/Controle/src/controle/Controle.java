// Larissa Alves de Souza

package controle;
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Documento[] vetor = new Documento[5];
        int i = 0;
        double maior = 0, menor = 0, soma = 0, media = 0;
        int maiorValor = 0, menorValor = 0; 
        
        // Entrada de dados
        for(i = 0; i < vetor.length; i++)
        {
            vetor[i] = new Documento();
            
            System.out.print("Insira o número: ");
            vetor[i].setNumero(teclado.nextInt());
            
            System.out.print("Insira o título: ");
            vetor[i].setTitulo(teclado.next());
            
            System.out.print("Insira o valor: ");
            vetor[i].setValor(teclado.nextDouble());
            
            System.out.println("\n");
        }
        
        // Encontra o maior valor
        maior = vetor[0].getValor();

        for(i = 1; i < vetor.length; i++) {
            if(vetor[i].getValor() > maior) 
            {
                maior = vetor[i].getValor();
                maiorValor = i;
            }
        }
        
        // Encontra o menor valor
        menor = vetor[0].getValor();

        for(i = 1; i < vetor.length; i++) {
            if(vetor[i].getValor() < menor) 
            {
                menor = vetor[i].getValor();
                menorValor = i;
            }
        }
        
        // Soma todos os valores
        for(i = 0; i < vetor.length; i++)
        {
            soma = soma + vetor[i].getValor();
        }
        
        // Calcula a média de todos os valores
        media = soma / 5;
        
        // Saída de dados
        System.out.println("O documento de maior valor possui o título de: " + vetor[maiorValor].getTitulo() + " e possui o valor de: " + vetor[maiorValor].getValor());
        
        System.out.println("O documento de menor valor possui o título de: " + vetor[menorValor].getTitulo() + " e possui o valor de: " + vetor[menorValor].getValor());
        
        System.out.println("A soma de todos os valores foi de: " + soma);
        
        System.out.println("A média dos valores informados foi de: " + media);
    }
    
}
