
package modelo;

/**
 *
 * @author plaga(c)
 * @date Mar 12, 2018
 * @time 9:50:29 AM
 */
public class Araña extends Animal {
    public Araña () {
    super();
}

    public Araña(int patas) {
        super(patas);
    }

    
    @Override
    public void comer( ){
        System.out.println("La Araña come moscas"); 
    } 
}
