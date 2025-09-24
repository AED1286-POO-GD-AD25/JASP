// Prog 0203.java
//Programa de pruea de la clase CuentaBancaria

import java.util.Scanner;

public class Prog0203 {
    static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        //mostrar mensaje de bienvenida
        System.out.println("Aplicación de cuenta bancaria");
        System.out.println("--------------------------");   
        System.out.println();

        System.out.println("Proporcine el totala de las cuentas a manejar: ");
        int N = entrada.nextInt();

        //crear objeto cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria();

        //pedir datos de la cuenta bancaria
        System.out.print("Número de cuenta: ");
        int numeroCuenta = entrada.nextInt();
        cuenta1.setNumeroCuenta(numeroCuenta);

        System.out.print("Titular de la cuenta: ");
        String titularCuenta = entrada.next();
        cuenta1.setTitularCuenta(titularCuenta);

        System.out.print("Saldo inicial: ");
        double saldoInicial = entrada.nextDouble();
        cuenta1.setSaldoCuenta(saldoInicial);

        System.out.print("Tasa de interés anual (en porcentaje): ");
        double tasaInteresAnual = entrada.nextDouble();
        CuentaBancaria.setTasaInteresAnual(tasaInteresAnual);

        //mostrar datos de la cuenta bancaria
        System.out.println("\nDatos de la cuenta bancaria:");
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Titular de la cuenta: " + cuenta1.getTitularCuenta());
        System.out.println("Saldo actual: " + cuenta1.getSaldoCuenta());
        System.out.println("Tasa de interés anual: " + CuentaBancaria.getTasaInteresAnual() + "%");
        System.out.println("Tasa de interés mensual: " + cuenta1.getTasaInteresMensual() + "%");

        //cerrar el scanner
        entrada.close();
    }
        
    
}
