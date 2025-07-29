/* Criar um projeto em Java com as variáveis String:

    "nome" e "endereco"

Atribuir valor a elas com seus dados e exibir quantos 
caracteres tem o seu nome e o seu endereço
*/

package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        
        String nome, endereco;
        int tamNome, tamEndereco;
        
        nome = "Larissa";
        endereco = "Mary Dota";
        
        tamNome = nome.length();
        tamEndereco = endereco.length();
        
        System.out.println("Meu nome tem " + tamNome + " letras e o meu endereço tem " + tamEndereco + " letras");
    }
    
}
