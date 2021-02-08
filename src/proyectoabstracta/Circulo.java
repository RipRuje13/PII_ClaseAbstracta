package proyectoabstracta;

public class Circulo extends Figura implements Transformable{
    
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double area(){
        return Math.pow(radio, 2)*Math.PI;
    } 
    @Override
    public double perimetro(){
        return Math.PI*radio*2;
    }
    @Override
    public void escalar(){
        System.out.println("Escalando Circulo");
    }
    @Override
    public void rotar(){
        System.out.println("Rotando Circulo");
    }
    @Override
    public void trasladar(){
        System.out.println("Trasladando Circulo");
    }
    @Override
    public String toString() {
        return "\nCirculo" + super.toString() + "\n\tRadio: " + radio;
    }
}
