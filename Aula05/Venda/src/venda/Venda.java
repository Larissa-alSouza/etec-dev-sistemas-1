package venda;
import java.util.Scanner;

public class Venda {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Produto item1 = new Produto();
        Produto item2 = new Produto();
        Produto item3 = new Produto();
        Produto item4 = new Produto();
        Produto item5 = new Produto();
        
        System.out.println("Digite o número do produto: ");
        item1.setNumero(teclado.nextInt());
        System.out.println("Digite a descrição do produto");
        item1.setDescricao(teclado.next());
        System.out.println("Digite o preço do produto: ");
        item1.setPreco(teclado.nextDouble());
        
        System.out.println("Digite o número do produto: ");
        item2.setNumero(teclado.nextInt());
        System.out.println("Digite a descrição do produto");
        item2.setDescricao(teclado.next());
        System.out.println("Digite o preço do produto: ");
        item2.setPreco(teclado.nextDouble());
        
        System.out.println("Digite o número do produto: ");
        item3.setNumero(teclado.nextInt());
        System.out.println("Digite a descrição do produto");
        item3.setDescricao(teclado.next());
        System.out.println("Digite o preço do produto: ");
        item3.setPreco(teclado.nextDouble());
        
        System.out.println("Digite o número do produto: ");
        item4.setNumero(teclado.nextInt());
        System.out.println("Digite a descrição do produto");
        item4.setDescricao(teclado.next());
        System.out.println("Digite o preço do produto: ");
        item4.setPreco(teclado.nextDouble());
        
        System.out.println("Digite o número do produto: ");
        item5.setNumero(teclado.nextInt());
        System.out.println("Digite a descrição do produto");
        item5.setDescricao(teclado.next());
        System.out.println("Digite o preço do produto: ");
        item5.setPreco(teclado.nextDouble());
        
        System.out.println(item1.getPreco() + item2.getPreco() + item3.getPreco() + item4.getPreco() + item5.getPreco());
    }
    
}
