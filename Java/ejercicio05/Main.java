package ejercicio05;

public class Main {
    
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        
        Coche coche1 = new Coche("Toyota","red",1200.5);
        Coche coche2 = new Coche("Mini","Black",1900.3);
        Coche coche3 = new Coche("Yaris","White",1400.3);     
        
        cocheCrud.save(coche1);
        cocheCrud.save(coche2);
        cocheCrud.save(coche3);
        
        cocheCrud.findAll();
        
        cocheCrud.delete(coche2);
        
        cocheCrud.findAll();
    }
}
