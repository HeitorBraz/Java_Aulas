import Classes.Cliente;
import Classes.Gerente;
import Classes.Vendedor;


// Classe de Teste
public class Teste {

    public static void main(String[] args) {
        
        // Criação dos Objetos
        Cliente cliente1 = new Cliente("Gabriel", 19, "Masculino", 2500, 2003);
        Gerente gerente1 = new Gerente("Renato", 40, "Masculino", 15000, "105020", "Logística");
        Vendedor vendedor1 = new Vendedor("Joana", 25, "Feminino", 5000, "251020", 100000, 10);
        
        // Teste de Saída de Dados dos Objetos
        System.out.println(cliente1.toString());
        System.out.println(gerente1.toString());
        System.out.println(vendedor1.toString());
        
    }
    
}
