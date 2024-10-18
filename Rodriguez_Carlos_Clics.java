/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_carlos_clics;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_Clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double costoC , clic , costo, input;
    
          System.out.print("***Calculando costos de clicks***\nIngrese la cantidad de clics:");
             clic = scanner.nextDouble();
             
         if (clic > 0 || clic <21 ){ costoC = 0.80;}
            else {if (clic > 20 || clic < 61){ costoC = 0.30;} 
            else {if (clic > 60){costoC = 0.25;} 
            else {costoC = 0;}}}
            
            //Calculo de Precio
            costo = (clic * costoC);
            input = costo * 0.16;
            costo = input + costo;
        
        //Salida de Datos
        String costoPromedioForm = String.format("%.2f", costo);
        System.out.print("El costo promedio de sus click son: " + costoPromedioForm + "\nCantidad de clics: " + clic + "\n");
    
    
    
    }

   }
    

