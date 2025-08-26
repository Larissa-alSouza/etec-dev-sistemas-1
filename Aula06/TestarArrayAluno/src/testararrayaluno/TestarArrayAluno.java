package testararrayaluno;
import java.util.Scanner;

public class TestarArrayAluno {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Aluno[] turma = new Aluno[5];
        int i;
        
        for(i = 0; i < turma.length; i=i+1)
        {
            turma[i] = new Aluno();
            
            System.out.println("Insira nome do aluno: ");
            turma[i].setNome(teclado.next());
            
            System.out.println("Insira a primeira nota: ");
            turma[i].setNota1(teclado.nextDouble());
            
            System.out.println("Insira a segunda nota: ");
            turma[i].setNota2(teclado.nextDouble());
        }
        
        for(i = 0; i < 5; i++)
        {
            System.out.println("A média do aluno " + turma[i].getNome() + " foi de: " + turma[i].calcularMedia());
        }
    }
    
}
