package testearraycontatos;

public class TesteArrayContatos {

    public static void main(String[] args) {
        
        Contato[] agenda = new Contato[5];
        
        agenda[0] = new Contato("Maria", "123456");
        agenda[1] = new Contato("Pedro", "654321");
        agenda[2] = new Contato("Marta", "951753");
        agenda[3] = new Contato("João", "357159");
        agenda[4] = new Contato("Miriam", "456258");
        
        System.out.println("***** Minha agenda de contatos***** \n");
        
        for(int i = 0; i < agenda.length; i++)
        {
            System.out.print("Nome: " + agenda[i].getNome() + " / ");
            System.out.println("Telefone: " + agenda[i].getTelefone());
        }
    }
    
}
