package Classes;

// Classe Pessoa
public class Pessoa {
    
    // Variáveis
    private String nome;
    private int idade;
    private String sexo;
    
    // Método Construtor
    public Pessoa(String nome, int idade, String sexo){
        
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
                    
    }

    // Métodos Gets
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    // Métodos Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Método toString
    @Override
    public String toString(){
        return
                "\nNome: "  + nome + 
                "\nIdade: " + idade + 
                "\nSexo: "  + sexo;
    }
    
}
