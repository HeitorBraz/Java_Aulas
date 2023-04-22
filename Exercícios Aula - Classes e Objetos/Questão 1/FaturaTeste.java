public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Teclado", 2, 50.0);
        System.out.println("N�mero da fatura: " + fatura1.getNumero());
        System.out.println("Descri��o: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Pre�o por item: " + fatura1.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());

        Fatura fatura2 = new Fatura("002", "Mouse", -1, -10.0);
        System.out.println("N�mero da fatura: " + fatura2.getNumero());
        System.out.println("Descri��o: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Pre�o por item: " + fatura2.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());
    }
}