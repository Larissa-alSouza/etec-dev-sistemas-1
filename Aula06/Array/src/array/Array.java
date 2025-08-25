package array;

public class Array {

    public static void main(String[] args) {
        
        String[] carros = {"Ferrari", "Fusca", "Camaro", "Uno"};
        // índice do array    [0]       [1]      [2]      [3]
        
        System.out.println("Tamanho do Array: " + carros.length);
        
        for(int i = 0; i < carros.length; i++)
        {
            System.out.println("carros["+i+"] = "+carros[i]);
        }
    }
    
}
