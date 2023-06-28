package Classes;

// Classe Vendedor
public class Vendedor extends Empregado{
    
    // Variáveis
    private double valorVendas;
    private int quantidadeVendas;
    
    // Método Construtor
    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int quantidadeVendas) {
        
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.quantidadeVendas = quantidadeVendas;
        
    }

    // Métodos Gets
    public double getValorVendas() {
        return valorVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    // Métodos Sets
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    
    // Método toString
    @Override
    public String toString(){
        return "\nDados do Vendedor: " 
                + super.toString() 
                + "\nValor das Vendas: " + valorVendas 
                + "\nQuantidade de Vendas: " + quantidadeVendas;
        
    }
    
    
    
    
    
}
