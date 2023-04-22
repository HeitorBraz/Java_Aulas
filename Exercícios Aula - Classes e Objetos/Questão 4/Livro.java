public class Livro {
    private String nome;
    private double preco;
    private String autor;

    public Livro(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public void imprimir() {
        System.out.println("Livro: " + nome + "\nPreço: " + preco + "\nAutor: " + autor);
    }
}
