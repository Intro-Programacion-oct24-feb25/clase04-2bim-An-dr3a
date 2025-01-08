/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Generar una solucion que permita sumar dos numeros a tra vez de un metodo, los numeros deben ser gresados por teclado en el metodo main. 
El metodo que genera la suma debe verificar que los dos sean numeros sean positivas para realizar la operacion, caso contrario la suma 
deber ser la suma 0
 */
package ejemplo03;
import ejemplos01.*;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        
        System.out.println("Ingrese el primer valor");
        valor1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        valor2 = entrada.nextInt();
        // 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
                                         
        System.out.printf("El valor de la suma es: %d\n", valor1);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){        
        int suma;        
        if (a > 0 && b > 0) {
           suma = a + b; 
        } else {
            suma = 0;
        }
        suma = a + b;
        return suma;
        // return a + b;
    }
    
    
}
