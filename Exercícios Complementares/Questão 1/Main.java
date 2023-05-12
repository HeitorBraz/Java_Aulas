public class Main {

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        
        rect1.setLenght(15);
        rect1.setWidth(10);
        
        System.out.println("O Valor do Comprimento é: " + rect1.getLenght());
        System.out.println("O Valor da Largura é: " + rect1.getWidth());
        
        System.out.println("O Valor do Perimetro é: " + rect1.calcularPerimetro());
        System.out.println("O Valor da Area é: " + rect1.calcularArea());
    }
    
}
