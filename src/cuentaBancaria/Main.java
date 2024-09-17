

package cuentaBancaria;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear cuenta con valores iniciales
        Cuenta cuenta = new Cuenta(123456789, "1234567", 1000.0, 10.0);
        
          //Crear objeto Scanner para leer entradas del usuario
    Scanner scanner = new Scanner(System.in);
    
    //Menú de opciones
    int opcion = 0;
    do {
        System.out.println("Menú de opciones:");
        System.out.println("1. Acreditar dinero");
        System.out.println("2. Debitar dinero");
        System.out.println("3. Actualizar saldo");
        System.out.println("4. Mostrar datos de la cuenta");
        System.out.println("5. Salir");
        System.out.print("Ingrese la opción deseada: ");
        opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.print("Ingrese la cantidad a acreditar: ");
                double montoCredito = scanner.nextDouble();
                cuenta.acreditar(montoCredito);
                System.out.println("Operación exitosa. Saldo actual: " + cuenta.getSaldo());
                break;
            case 2:
                System.out.print("Ingrese la cantidad a debitar: ");
                double montoDebito = scanner.nextDouble();
                if(cuenta.debitar(montoDebito)) {
                    System.out.println("Operación exitosa. Saldo actual: " + cuenta.getSaldo());
                } else {
                    System.out.println("No se pudo realizar la operación. Saldo insuficiente.");
                }
                break;
            case 3:
                cuenta.actualizarSaldo();
                System.out.println("Saldo actualizado. Saldo actual: " + cuenta.getSaldo());
                break;
            case 4:
                cuenta.imprimirDatos();
                
                break;
            case 5:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
    } while(opcion != 5);
    
    scanner.close();
}
}