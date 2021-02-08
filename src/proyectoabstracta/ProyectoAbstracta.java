package proyectoabstracta;

public class ProyectoAbstracta {

    public static void main(String[] args) {
        //Polimorfismo con clases abstractas.
        Figura fs[] = new Figura[5]; 
        fs[0]= new Circulo("rojo",2);
        fs[1]= new Circulo("verde",2);
        fs[2]= new Cuadrado("verde",2);
        fs[3]= new Triangulo("azul",2,3);
        fs[4]= new Triangulo("morado",2,3);        
        
        for(int i = 0 ; i < 5; i++){
            System.out.println("Área de "+fs[i].getClass().getSimpleName()+": "+fs[i].area());
            System.out.println("Perímetro de "+fs[i].getClass().getSimpleName()+": "+fs[i].perimetro());
            fs[i].rotar();
            System.out.println(fs[i].toString());
        }
        //Polimorfismo con interfaces
        Transformable ts[] = new Transformable[5];
        ts[0]= new Circulo("rojo",2);
        ts[1]= new Circulo("verde",2);
        ts[2]= new Cuadrado("verde",2);
        ts[3]= new Triangulo("azul",2,3);
        ts[4]= new Triangulo("morado",2,3);
        for(int i = 0 ; i < 5; i++){
            //Downcasting necesario para invocar área y perímetro
            //Usar instanceof
                   
            //System.out.println("Área de "+ts[i].getClass().getSimpleName()+": "+ts[i].area());
            //System.out.println("Perímetro de "+ts[i].getClass().getSimpleName()+": "+ts[i].perimetro());
            ts[i].rotar();
        }   
    }    
}


