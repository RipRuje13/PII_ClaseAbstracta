package proyectoabstracta;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }  
    @Override
    public double area(){
        return Math.pow(lado, 2);
    }
    @Override
    public double perimetro(){
        return lado*4;
    }
    @Override
    public void escalar(){
        System.out.println("Escalando Cuadrado");
    }
    @Override
    public void rotar(){
        System.out.println("Rotando Cuadrado");
    }
    @Override
    public void trasladar(){
        System.out.println("Trasladando Cuadrado");
    }

    @Override
    public String toString() {
        return "\nCuadrado" + super.toString() + "\n\tLado: " + lado;
    }
}
