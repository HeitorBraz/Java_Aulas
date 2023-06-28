package Classes;

// Classe Gerente
public class Gerente extends Empregado {
    
    // Variáveis
    private String nomeGerencia;
    
    // Método Construtor
    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
        
    }

    // Métodos Gets
    public String getNomeGerencia() {
        return nomeGerencia;
    }

    // Métodos Sets
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "\nDados do Gerente: " + super.toString() 
                + "\nNome da Gerência: " + nomeGerencia;
        
    }
    
    
    
}
