package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    
    List<Coche> coches = new ArrayList();
    
    //CONSTRUCTORES
    public CocheCRUDImpl(){
    }
    
    //METODOS
    public void save(Coche coche){
        coches.add(coche);
    }
    public void findAll(){
        System.out.println("******************");
        for(Coche coche: coches){
            System.out.println(coche);
        }
    }
    public void delete(Coche coche){
        coches.remove(coche);
    }
}
