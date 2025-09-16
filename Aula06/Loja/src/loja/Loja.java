package loja;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0, i = 0;
        double somaValor = 0, somaQtd = 0;
        double mediaValor = 0, mediaQtd = 0;
        double maior = 0, menor = 0;
        int maiorValor = 0, menorQtd = 0;
        
        System.out.print("Quantos registros você quer fazer? ");
        num = teclado.nextInt();
        
        System.out.println("\n");
        
        Venda[] notas = new Venda[num];
        
        for(i = 0; i < notas.length; i++)
        {
            notas[i] = new Venda();
            
            System.out.print("Insira o código: ");
            notas[i].setCodigo(teclado.nextInt());
            
            System.out.print("Insira a descrição: ");
            notas[i].setDescricao(teclado.next());
            
            System.out.print("Insira o valor: ");
            notas[i].setValor(teclado.nextDouble());
            
            System.out.print("Insira a quantidade: ");
            notas[i].setQuantidade(teclado.nextDouble());
            
            System.out.println("\n");
        }
        
        for(i = 0; i < notas.length; i++)
        {
            somaValor = somaValor + notas[i].getValor();
        }
        
        for(i = 0; i < notas.length; i++)
        {
            somaQtd = somaQtd + notas[i].getQuantidade();
        }
        
        mediaValor = somaValor / notas.length;
        mediaQtd = somaQtd / notas.length;
        
        maior = notas[0].getValor();
        
        for(i = 1; i < notas.length; i++)
        {
            if(notas[i].getValor() > maior)
            {
                maior = notas[i].getCodigo();
                maiorValor = i;
            }
        }
        
        menor = notas[0].getQuantidade();
        
        for(i = 1; i < notas.length; i++)
        {
            if(notas[i].getQuantidade() < menor)
            {
                menor = notas[i].getQuantidade();
                menorQtd = i;
            }
        }
        
        System.out.println("A média de valores foi de: " + mediaValor);
        System.out.println("A média de quantidades foi de: " + mediaQtd);
        System.out.println("O código do maior valor é: " + notas[maiorValor].getCodigo());
        System.out.println("A descrição da menor quantidade é: " + notas[menorQtd].getDescricao());
    }
    
}
