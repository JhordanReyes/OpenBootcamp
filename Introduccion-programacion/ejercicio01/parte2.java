public class parte2 {
    public static void main(String[]args){   
        coche miCoche = new coche();
        miCoche.añadirPuerta();
        miCoche.añadirPuerta();
        System.out.println(miCoche.puerta);
    }
}
class coche{
    int puerta = 0;
    public void añadirPuerta(){
        this.puerta++;
    }
}