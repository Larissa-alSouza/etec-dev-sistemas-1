//Larissa Alves de Souza -- 2° DS noturno

package empregadoteste;
import java.util.Scanner;

public class EmpregadoTeste {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        
        System.out.println("Insira o código do primeiro empregado: ");
        empregado1.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome do primeiro empregado: ");
        empregado1.setNome(teclado.next());
        System.out.println("Digite o sobrenome do primeiro empregado: ");
        empregado1.setSobrenome(teclado.next());
        System.out.println("Insira o salário mensal do primeiro empregado: ");
        empregado1.setSalariomensal(teclado.nextDouble());
        
        System.out.println("Insira o código do segundo empregado: ");
        empregado2.setCodigo(teclado.nextInt());
        System.out.println("Digite o nome do segundo empregado: ");
        empregado2.setNome(teclado.next());
        System.out.println("Digite o sobrenome do segundo empregado: ");
        empregado2.setSobrenome(teclado.next());
        System.out.println("Insira o salário mensal do segundo empregado: ");
        empregado2.setSalariomensal(teclado.nextDouble());
        
        double salario_anual_1 = empregado1.getSalariomensal() * 12;
        double salario_anual_2 = empregado2.getSalariomensal() * 12;
        
        System.out.println("O salário anual do empregado " + empregado1.getNome() + " " + empregado1.getSobrenome() + " foi de: " + salario_anual_1);
        System.out.println("O salário anual do empregado " + empregado2.getNome() + " " + empregado2.getSobrenome() + " foi de: " + salario_anual_2);
    }
    
}
