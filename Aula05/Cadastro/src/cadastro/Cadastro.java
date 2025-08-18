package cadastro;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa registro1 = new Pessoa();
        System.out.println("Digite o Código: ");
        registro1.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa: ");
        registro1.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa: ");
        registro1.setIdade(teclado.nextInt());
        
        Pessoa registro2 = new Pessoa();
        System.out.println("Digite o Código: ");
        registro2.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa: ");
        registro2.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa: ");
        registro2.setIdade(teclado.nextInt());
        
        Pessoa registro3 = new Pessoa();
        System.out.println("Digite o Código: ");
        registro3.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome da pessoa: ");
        registro3.setNome(teclado.next());
        System.out.println("Digite a idade da pessoa: ");
        registro3.setIdade(teclado.nextInt());
        
        if(registro1.getIdade() > registro2.getIdade())
        {
            if(registro1.getIdade() > registro3.getIdade())
            {
                System.out.println(registro1.nome + "É mais velho");
            }
        }
        else if(registro2.getIdade() > registro3.getIdade())
        {
            System.out.println(registro2.nome + "É mais velho");
        }
        else
        {
            System.out.println(registro3.nome + "É mais velho");
        }
    }
    
}
