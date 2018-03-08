
package javaapplication98;

public class CuentaCorriente extends Cliente{
   private Cliente titular;
   private int nroDeCuenta;
   private double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroDeCuenta() {
        return nroDeCuenta;
    }

    public void setNroDeCuenta(int nroDeCuenta) {
        this.nroDeCuenta = nroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroDeCuenta, double saldo) {
        this.titular = titular;
        this.nroDeCuenta = nroDeCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroDeCuenta) {
        this.titular = titular;
        this.nroDeCuenta = nroDeCuenta;
    }
   
   public double depositar(double monto){
        saldo = saldo + monto;
        return saldo;
   }
   
   public double extraer(double monto){
        saldo = saldo - monto;
        return saldo;
   }
    
   public void imprimirDatos(){
       
       System.out.println(titular.getNombre() + titular.getApellido() + titular.getEdad() + nroDeCuenta);
   }
   
   @Override
   public boolean equals (Object o){
       if (o instanceof CuentaCorriente){
      CuentaCorriente p = (CuentaCorriente) o;
      return p.nroDeCuenta == nroDeCuenta;
   }
       else
       return false;
   }
}
