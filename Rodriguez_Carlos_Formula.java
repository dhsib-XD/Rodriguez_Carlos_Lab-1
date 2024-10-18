/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;





/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_Formula {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numeroA, denominadorB, numeroC, denominadorD, Total;

        System.out.print("Ingrese el numerador A: ");
        numeroA = scanner.nextDouble();

        System.out.print("Ingrese el denominador B: ");
        denominadorB = scanner.nextDouble();

        System.out.print("Ingrese el numerador C: ");
        numeroC = scanner.nextDouble();

        System.out.print("Ingrese el denominador D: ");
        denominadorD = scanner.nextDouble();

        Total = (numeroA / denominadorB) + (numeroC / denominadorD);

        System.out.println("El resultado es: " + Total);
        
 
    }
}

    
    
    
    
    
        
    }
    
