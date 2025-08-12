package projeto;

public class Projeto {

    
    public static void main(String[] args) {
        
        Produto p;
        
        p = new Produto();
        
        p.setId(1);
        p.setNome("Senhor dos Anéis");
        p.setDesc("Filme de fantasia");
        
        System.out.println("O id: " + p.getId());
        System.out.println("O nome: " + p.getNome());
        System.out.println("Descrição: " + p.getDesc());
        
        Produto p2 = new Produto();
        
        p2.setId(100);
        p2.setNome("Titanic");
        p2.setDesc("Maior bilheteria da história");
        
        System.out.println("Id: " + p2.getId());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Descrição: " + p2.getDesc());
    }
    
}
