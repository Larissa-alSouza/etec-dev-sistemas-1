package boletim;
import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Nota b1 = new Nota();
        Nota b2 = new Nota();
        Nota b3 = new Nota();
        Nota b4 = new Nota();
        
        System.out.println("Digite o bimestre: ");
        b1.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        b1.setValorNota(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        b2.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        b2.setValorNota(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        b3.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        b3.setValorNota(teclado.nextDouble());
        
        System.out.println("Digite o bimestre: ");
        b4.setBimestre(teclado.nextInt());
        System.out.println("Digite a nota: ");
        b4.setValorNota(teclado.nextDouble());
        
        System.out.println("A média foi: " + (b1.getValorNota() + b2.getValorNota() + b3.getValorNota()+ b4.getValorNota()) / 4);
    }
    
}
