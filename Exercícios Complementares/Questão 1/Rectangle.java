public class Rectangle {
    
    private float lenght = 1;
    private float width = 1;
    private float perimetro;
    private float area;
    
    public float calcularPerimetro(){
        perimetro = (getLenght() * 2) + (getWidth() * 2);
        return perimetro;
    }
    
    public float calcularArea(){
        area = getLenght() * getWidth();
        return area;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setLenght(float lenght) {
        if(this.lenght > 0 || this.lenght < 20){
            this.lenght = lenght;
        }
        else{
            System.out.println("Insira um valor entre 0 e 20!");
        }
    }

    public void setWidth(float width) {
        if(this.width > 0 || this.width < 20){
            this.width = width;
        }
        else{
            System.out.println("Insira um valor entre 0 e 20!");
        }
    }
    
    
}
