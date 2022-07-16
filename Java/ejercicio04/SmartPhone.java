package ejercicio04;

public class SmartPhone extends SmartDevice{
    boolean teclado;
    
    public SmartPhone(){
    }
    public SmartPhone(String modelo, String color, boolean bluetooth, boolean teclado){
        super(modelo, color, bluetooth);
        this.teclado = teclado;
    }
    public void instalarApps(){
        System.out.println("Se esta descargando una app");
    }
    public void mostrarDatos(){
        System.out.println("\nDATOS----");
        System.out.println("Modelo: " + this.modelo + "\nColor: " + this.color + "\nBluetooth: " + this.bluetooth + "\nTeclado: " + this.teclado);
    }
}