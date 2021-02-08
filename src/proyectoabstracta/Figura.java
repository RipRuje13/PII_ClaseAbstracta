package proyectoabstracta;

abstract public class Figura implements Transformable{
    private String color;
    
    public Figura(String c){
        color = c;
    }
    
    abstract public double area();
    abstract public double perimetro();
    
    @Override
    public String toString(){
        return "\n\tColor: "+color;
    }
}
