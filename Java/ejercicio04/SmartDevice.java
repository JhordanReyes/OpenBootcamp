package ejercicio04;

public class SmartDevice {
    String modelo;
    String color;
    boolean bluetooth;
    String estado = "Apagado";
    
    public SmartDevice(){}
    
    public SmartDevice(String modelo, String color, boolean bluetooth){
        this.modelo = modelo;
        this.color = color;
        this.bluetooth = bluetooth;
    }
    public void prender(){
        this.estado = "Prendido";
        System.out.println("Estoy prendido");
    }
    public void Apagar(){
        this.estado = "Apagado";
        System.out.println("Estoy apagado");
    }
    public void Reloj(){
        System.out.println("Imprime fecha y hora");
    }
}
