
package modelo;

/**
 *
 * @author plaga(c)
 * @date Mar 12, 2018
 * @time 9:50:51 AM
 */
public class Pez  extends Animal{
    
    public Pez () {
    super();
}

    public Pez(int patas) {
        super(patas);
    }

    
    @Override
    public void comer( ){
        System.out.println("El Pez come Algas"); 
    } 
}
