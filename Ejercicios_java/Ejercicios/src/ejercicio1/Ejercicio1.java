/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int numero1,numero2,numero3;
        
         System.out.println("Ingresa el primer numero  ");
        numero1=leer.nextInt();
         System.out.println("Ingresa el seundo numero  ");
        numero2=leer.nextInt();
         System.out.println("Ingresa el tercer numero ");
        numero3=leer.nextInt();
        
        
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero 1 es mayor: " +numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero 2 es mayor:  " + numero2);    
        }
        
        else if(numero3 > numero1 && numero3 > numero2){
                System.out.println("El numero 3 es mayor: " + numero3);
        }
        else if(numero1 == 0 && numero2 == 0 && numero3 == 0){
            System.out.println("Los numeros son nulos");
        }
        else if(numero1==numero2 && numero2==numero3){
                
             System.out.println("Los numeros son iguales");
        }
        
        
        
        
    }
    
}
