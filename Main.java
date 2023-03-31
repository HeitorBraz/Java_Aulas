
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String nomeDono = JOptionPane.showInputDialog("Digite o seu Nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
        String email = JOptionPane.showInputDialog("Digite o seu E-mail: ");
        
        String nomePet = JOptionPane.showInputDialog("Digite o Nome do Pet: ");
        String racaPet = JOptionPane.showInputDialog("Digite a Raça do Pet: ");
        String idadePet = JOptionPane.showInputDialog("Digite a Idade do Pet: ");
        int idadePetInt = Integer.parseInt(idadePet);
        
        JOptionPane.showMessageDialog(null, "Seu Nome: " +nomeDono 
                                                            +"\nSeu CPF: " +cpf 
                                                            +"\nSeu E-mail: " +email 
                                                            +"\nNome do seu Pet: " +nomePet 
                                                            +"\nRaça do Seu Pet: " +racaPet 
                                                            +"\nIdade do Seu Pet: " +idadePet);
    }   
}
