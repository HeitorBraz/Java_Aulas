package Classes;

// Classe Empregado
public class Empregado extends Pessoa {
    
    // Variáveis
    protected double salario;
    protected String matricula;
    protected double inss;
    
    // Método Construtor
    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
        
    }

    // Métodos Gets
    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    // Métodos Sets
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // Método valorINSS
    public double valorINSS(){
        
        inss = salario * 1.1;
        return inss;
        
    }
    
    // Método toString
    @Override
    public String toString(){
        return
                super.toString() 
                + "\nSalário: " + salario 
                +"\nMatrícula: " + matricula 
                + "\nValor do INSS: " + this.valorINSS();
    }
    
    
    
}
