
package javaapplication98;


public class CuentaAhorro extends CuentaCorriente {
    private double interes = 2.5;

    public CuentaAhorro(double interes, Cliente titular, int nroDeCuenta, double saldo) {
        super(titular, nroDeCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente titular, int nroDeCuenta, double interes) {
        super(titular, nroDeCuenta);
                this.interes = interes;
    }

    public CuentaAhorro(Cliente titular, int nroDeCuenta) {
        super(titular, nroDeCuenta);
    }
   
    
    //Si usamos el constructor con 3 o 2 argumentos: ¿qué valor inicial tiene el saldo? y en el caso de 2 argumentos ¿qué valor inicial tiene el interés?  

}
