/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo03;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 
        int limite;
        int tabla;
        int opcion;
        double suma;
        double multiplicacion;
        
        String mensajeSuma;
        String mensajeSumaDos;
        
        System.out.println("Ingrese el limite");
        limite = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la tabla");
        tabla = entrada.nextInt();
        
        System.out.println("Ingrese 1 para generar la tabla de sumar");
        opcion = entrada.nextInt();
        
        System.out.println("Ingrese 2 para la tabla de multiplicar");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
                System.out.printf("%s\n", mensajeSuma);
                break;
                
            case 2:
                mensajeSuma = obtenerTablaMultiplicar(limite, tabla);
                System.out.printf("%s\n", mensajeSuma);
                break;
                   
        }
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
