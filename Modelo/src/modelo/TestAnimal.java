
package modelo;



/**
 *
 * @author plaga(c)
 */
public class TestAnimal{
    
    
        /**
    /**
     *
     * @param a
     */
    public static void MuestraqueCome(Animal a){
        a.comer();
    }
   
       
    
    public static void main(String[] args) {
     
     Animal a= new Araña();
     Animal g= new Gato();
     Animal p= new Pez();
     Animal aa= new Araña(8);
     Animal g1= new Gato(4);
     Animal p1= new Pez(0);
       
     MuestraqueCome(a);
    MuestraqueCome(g);
    MuestraqueCome(p);
    }
   
}
