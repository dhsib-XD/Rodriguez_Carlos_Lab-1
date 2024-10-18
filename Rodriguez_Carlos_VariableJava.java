/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_carlos_variable.java;

import java.util.Scanner;


/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_VariableJava {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useDelimiter("\n");
        System.out.print("Favor Ingrese el nombre del empleado:");
        String empleado = scanner.nextLine();
        
        System.out.print("Favor ingrese las horas elaboradas del mes:");
        double horas = scanner.nextDouble();
        
        System.out.print("Ingrese la tarifa:");
        double tarifa = scanner.nextDouble();
        
         System.out.print("Ingrese el salario del empleado:");
        double salario = ( tarifa * horas );
        
    System.out.print("**Boleta de empleado**"
    +"\nNombre completo:"+ empleado
    +"\n Horas trabajadas durante el mes pasado es:"+ horas + "Horas al mes"
    +"\n Tarifa del empleado es :"+ tarifa + "Lps"
    +"\nSalrio del empleado es :"+ salario + "Lps");

    
        
        
        
        
        
    }
        
     
    }
    

