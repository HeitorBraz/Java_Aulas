public class Main {

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        
        rect1.setLenght(15);
        rect1.setWidth(10);
        
        System.out.println("O Valor do Comprimento �: " + rect1.getLenght());
        System.out.println("O Valor da Largura �: " + rect1.getWidth());
        
        System.out.println("O Valor do Perimetro �: " + rect1.calcularPerimetro());
        System.out.println("O Valor da Area �: " + rect1.calcularArea());
    }
    
}
