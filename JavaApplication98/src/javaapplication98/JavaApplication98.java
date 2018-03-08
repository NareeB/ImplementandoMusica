/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication98;

/**
 *
 * @author plaga(c)
 */
public class JavaApplication98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona p1 = new Persona("valeria", "Lofrano", 30342971);
      Persona p2 = new Persona("valeria", "Lofrano", 30342972);
      System.out.println(p1.equals(p2));
      
      CuentaAhorro c = new CuentaAhorro(new Cliente ("valeria", "Lofrano",34), 1000,20.0);
      System.out.println(c.getSaldo());
    }
    
}
