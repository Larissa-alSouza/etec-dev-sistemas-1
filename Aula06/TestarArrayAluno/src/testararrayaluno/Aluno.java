package testararrayaluno;

public class Aluno {
    
    String nome;
    double nota1;
    double nota2;

    public Aluno() {
        /* 
            Método construtor que não me obriga 
            a preencher tudo de uma vez
        */
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia()
    {
        double resultado = 0;
        
        resultado = (this.nota1 + this.nota2) / 2;
        
        return resultado;
    }
}
