package ejercicio04;

public class SmartWatch extends SmartDevice{
    boolean modoDeportes;
    
    public SmartWatch(){
    }
    public SmartWatch(String modelo, String color, boolean bluetooth, boolean modoDeportes){
        super(modelo, color, bluetooth);
        this.modoDeportes = modoDeportes;
    }
    
    public void darFrecuanciaCardiaca(){
        System.out.println("Detectando frecuencia cardiaca");
    }
    public void darpresionArterial(){
        System.out.println("Detectando frecuencia arterial");
    }
    public void alarmaSedentarismo(){
        System.out.println("LEVANTATE ESTAS SIENDO MUY SEDENTARIO!!");
    }
    public void mostrarDatos(){
        System.out.println("\nDATOS----");
        System.out.println("Modelo: " + this.modelo + "\nColor: " + this.color + "\nBluetooth: " + this.bluetooth + "\nModo Deportes: " + this.modoDeportes);
    }
}