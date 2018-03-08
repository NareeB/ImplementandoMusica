
package javaapplication98;


public class Persona {
  public String nombre;
  public String apellido;
  public int nroDNI;
  public Persona(String n, String a, int DNI) {
    nombre = n;
    apellido = a;
    nroDNI = DNI;
  }
  public String devolverNombreCompleto(){
   return "Nombre: " + nombre + " Apellido: " + apellido;
  }
  
  public String toString(){
      return devolverNombreCompleto() + " DNI " + nroDNI;
  }
  
  @Override
  public boolean equals (Object o){
      if (o instanceof Persona) {
      Persona p = (Persona) o;
     return  p.getNombre().equals(nombre) &&  p.getApellido().equals(apellido) &&  p.getNroDNI() == nroDNI;
      }
     else 
     return false;
      
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroDNI() {
        return nroDNI;
    }

    public void setNroDNI(int nroDNI) {
        this.nroDNI = nroDNI;
    }
  
}

