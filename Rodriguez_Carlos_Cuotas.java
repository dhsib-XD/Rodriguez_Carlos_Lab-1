/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_carlos_cuotas.java;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_CuotasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Favor ingrese el monto: ");
        double monto = scanner.nextDouble();
        
        System.out.print("Ingrese el plazo en meses: ");
        int plazo = scanner.nextInt();
        
        double interesAnual = 0.17;
        double interesMensual = interesAnual / 12;
        double Pseguro = 0.01;
        double comisionPcuota = 0.05;
        
        double cuota = (monto * interesMensual * Math.pow(1 + interesMensual, plazo)) / 
                       (Math.pow(1 + interesMensual, plazo) - 1);
        
        double seguro = cuota * Pseguro;
        double cuotaFinal = cuota + comisionPcuota + seguro;
        
        double total = cuotaFinal * plazo;
        
        System.out.println("Cuota de pago mensual: " + cuotaFinal + " Lps");
        System.out.println("Total a pagar: " + total + " Lps");
        
           
        
    }
    
}
