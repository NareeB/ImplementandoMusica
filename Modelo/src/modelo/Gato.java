
package modelo;

/**
 *
 * @author plaga(c)
 * @date Mar 12, 2018
 * @time 9:50:42 AM
 */
public class Gato extends Animal {
    
    /**
     *
     */
    public Gato () {
    super();
}

    public Gato(int patas) {
        super(patas);
    }

  

    
     public void comer( ){
        System.out.println("El gato come ratones"); 
    } 
}
