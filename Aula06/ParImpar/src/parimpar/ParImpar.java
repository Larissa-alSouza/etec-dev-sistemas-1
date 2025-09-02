// Larissa Alves de Souza

package parimpar;
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int elemento;
        int contimpar = 0, contpar = 0;
        int i = 0,j = 0, k = 0; 
        
        System.out.print("Insira a quantidade de elementos que você deseja no vetor: ");
        elemento = teclado.nextInt();
        
        System.out.println("\n");
        
        int[] numeros = new int[elemento];
        
        //entrada de dados do vetor numeros 
        for(i = 0; i < numeros.length; i++)
        {
            System.out.print("Insira um número para a posição [" + i + "] do vetor: ");
            numeros[i] = teclado.nextInt();
            
            //verificando se o valor é par ou ímpar para incrementar nos contadores
            if(numeros[i] % 2 == 0)
            {
                contpar++;
            }
            else
            {
                contimpar++;
            }
        }
        
        System.out.println("\n");
        
        //criação dos vetores par e impar com tamanho de acordo com o obtido pelos contadores
        int[] par = new int[contpar];
        int[] impar = new int[contimpar];
        
        //separa os valores do vetor numeros, os inserindo em seus devidos vetores
        for(i = 0; i < numeros.length; i++)
        {
            if(numeros[i] % 2 == 0)
            {
                par[j] = numeros[i]; // variável diferente "j" para não pular posições
                j++; // incrementa a variável j para não sobreescrever os valores
            }
            else
            {
                impar[k] = numeros[i]; // variável diferente "k" para não pular posições
                k++; // incrementa a variável k para não sobreescrever os valores
            }
        }
        
        //saída de dados dos vetores par e impar, apresentando também seus índices
        
        System.out.println("O vetor par possui " + contpar + " índice(s)");
        System.out.println("Vetor par:");
        for(j = 0; j < par.length; j++)
        {
            System.out.println(par[j]);
        }
        
        System.out.println("\n");
        
        System.out.println("O vetor ímpar possui " + contimpar + " índice(s)");
        System.out.println("Vetor ímpar: ");
        for(k = 0; k < impar.length; k++)
        {
            System.out.println(impar[k]);
        }
    }
    
}

