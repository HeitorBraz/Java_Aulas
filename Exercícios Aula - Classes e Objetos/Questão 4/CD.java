public class CD {
    private String nome;
    private double preco;
    private int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numeroFaixas = numeroFaixas;
    }

    public void imprimir() {
        System.out.println("CD: " + nome + "\nPreço: " + preco + "\nNúmero de faixas: " + numeroFaixas);
    }
}