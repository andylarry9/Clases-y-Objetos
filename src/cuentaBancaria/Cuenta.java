
package cuentaBancaria;

public class Cuenta {
    private long numCuenta;
    private String CI;
    private double saldo;
    private double interesAnual;
    
    //Constructor por defecto
    public Cuenta() {
        this.numCuenta = 0;
        this.CI = "";
        this.saldo = 0.0;
        this.interesAnual = 0.0;
    }
    
    //Constructor con parámetros
    public Cuenta(long numCuenta, String CI, double saldo, double interesAnual) {
        this.numCuenta = numCuenta;
        this.CI = CI;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }
    
    //Métodos de acceso y modificación
    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    //Método para actualizar el saldo con el interés diario
    public void actualizarSaldo() {
        double interesDiario = (interesAnual / 365) * saldo;
        saldo += interesDiario;
    }
    
    //Método para acreditar dinero en la cuenta
    public void acreditar(double monto) {
        saldo += monto;
    }
    
    //Método para debitar dinero de la cuenta
    public boolean debitar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }
    
    //Método para imprimir los datos de la cuenta
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("CI del cliente: " + CI);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Interés anual: " + interesAnual);
    }

    
}

