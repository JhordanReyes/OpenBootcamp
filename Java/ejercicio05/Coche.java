package ejercicio05;

public class Coche {
    
    //VARIABLES
    String modelo;
    String color;
    Double kilometros;
    
    //CONSTRUCTORES
    public Coche(){}
    public Coche(String modelo, String color, Double kilometros){
        this.modelo = modelo;
        this.color = color;
        this.kilometros = kilometros;
    }
    //METODOS
    public void avanzar(){
        System.out.println("El auto avanza");
    }
    public void detener(){
        System.out.println("El auto se detiene");
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", color=" + color + ", kilometros=" + kilometros + '}';
    }
    
}