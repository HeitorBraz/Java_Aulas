public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 5000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 6000.0);

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());

        empregado1.aumentarSalario(10.0);
        empregado2.aumentarSalario(10.0);

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + " após aumento: " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + " após aumento: " + empregado2.getSalarioAnual());
    }
}
