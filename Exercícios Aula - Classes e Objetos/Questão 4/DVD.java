public class DVD {
    private String nome;
    private double preco;
    private double duracao;

    public DVD(String nome, double preco, double duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public void imprimir() {
        System.out.println("DVD: " + nome + "\nPreço: " + preco + "\nDuração: " + duracao);
    }
}
