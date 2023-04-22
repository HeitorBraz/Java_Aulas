
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        LocalDate dataAtual = LocalDate.now();
        einstein.calculaIdade(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());
        newton.calculaIdade(dataAtual.getDayOfMonth(), dataAtual.getMonthValue(), dataAtual.getYear());

        System.out.println(einstein);
        System.out.println(newton);
    }
}
