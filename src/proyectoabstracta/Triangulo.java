package proyectoabstracta;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return base*altura/2;
    }
    @Override
    public double perimetro(){
        return 3*base;
    }
    @Override
    public void escalar(){
        System.out.println("Escalando Triángulo");
    }
    @Override
    public void rotar(){
        System.out.println("Rotando Triángulo");
    }
    @Override
    public void trasladar(){
        System.out.println("Trasladando Triángulo");
    }
    @Override
    public String toString() {
        return "\nTriángulo" + super.toString() + "\n\tBase: " + base + "\n\tAltura: " + altura;
    }
}
