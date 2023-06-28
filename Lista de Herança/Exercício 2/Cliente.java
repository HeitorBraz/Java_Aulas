package Classes;

// Classe Cliente
public class Cliente extends Pessoa {
    
    // Variáveis
    private double valorDivida;
    private int anoNascim;
    
    // Método Construtor
    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim){ 
            
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
        
    }

    // Métodos Get
    public double getValorDivida() {
        return valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    // Métodos Set
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "Dados do Cliente: " 
                + super.toString() 
                + "\nValor da Dívida: " + valorDivida 
                + "\nAno de Nascimento: " + anoNascim;
    }
    

    
}
