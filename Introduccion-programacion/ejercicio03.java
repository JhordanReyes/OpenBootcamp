/**
Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por 
último muéstralas por consola.
*/
public class ejercicio03{
    public static void main(String[]args){
        persona persona1 = new persona();
        
        persona1.setEdad(12);
        persona1.setNombre("Rodrigo");
        persona1.setTelefono(964128973);
    
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}
class persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}