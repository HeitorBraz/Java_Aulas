public class Loja {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Pequeno Príncipe", 20.0, "Antoine de Saint-Exupéry");
        Livro livro2 = new Livro("Dom Casmurro", 25.0, "Machado de Assis");
        CD cd1 = new CD("Thriller", 30.0, 9);
        DVD dvd1 = new DVD("O Rei Leão", 40.0, 88.0);
        DVD dvd2 = new DVD("A Bela e a Fera", 35.0, 84.0);

        livro1.imprimir();
        livro2.imprimir();
        cd1.imprimir();
        dvd1.imprimir();
        dvd2.imprimir();
    }
}
