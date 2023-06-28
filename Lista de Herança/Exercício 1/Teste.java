import Classes.Cachorro;
import Classes.Peixe;

// Classe para o teste
public class Teste {

    public static void main(String[] args) {                
        
        // Criação dos Objetos
        Peixe peixe1 = new Peixe("Nemo", 0.5, "Rio");
        Cachorro cachorro1 = new Cachorro("Bolt", 20, "Golden Retrivier");
        
        // Saída
        System.out.println("Dados do Peixe:\n" + peixe1.toString());
        System.out.println("\n--------------------------------------------------");
        System.out.println("\nDados do Cachorro:\n" + cachorro1.toString());
        
    }
    
}
