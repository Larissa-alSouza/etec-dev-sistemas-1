package controle;

public class Documento {
    
    int numero;
    String titulo;
    double valor;
    
    public Documento() {
        /* 
            Método construtor que não me obriga 
            a preencher tudo de uma vez
        */
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
