/**
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva 
clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, 
el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una 
variable salario que solo tenga la clase Trabajador.
*/
class ejercicio04{
    public static void main(String[]args){
        cliente cliente1 = new cliente();
        trabajador trabajador1 = new trabajador();

        cliente1.setEdad(18);
        cliente1.setTelefono(945625238);
        cliente1.setNombre("Jeferson");
        cliente1.setCredito(1200);

        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getCredito());

        trabajador1.setEdad(20);
        trabajador1.setTelefono(927827638);
        trabajador1.setNombre("Joel");
        trabajador1.setSalario(1500);

        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getSalario());
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
class cliente extends persona{
    private int credito;
    
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}
class trabajador extends persona{
    private int salario;
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}