package ejercicio04;

/**
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
 
public class Main {
    
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("Galaxy A03s Black","black",true,true);
        smartphone.prender();
        smartphone.Reloj();
        smartphone.instalarApps();
        smartphone.mostrarDatos();
        System.out.println("\n**********************************\n");
        SmartWatch smartwatch = new SmartWatch("MyKronoz ZeTime","gray",true,true);
        smartwatch.alarmaSedentarismo();
        smartwatch.darFrecuanciaCardiaca();
        smartwatch.darpresionArterial();
        smartwatch.mostrarDatos();
    }
}
