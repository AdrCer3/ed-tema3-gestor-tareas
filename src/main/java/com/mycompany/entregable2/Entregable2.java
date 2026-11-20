/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entregable2;
import java.util.Scanner;

/**
 *
 * @author adriancl
 */
public class Entregable2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double resultado;
        while (opcion != 5) {
            mostrarMenu();
            int operacion = sc.nextInt();
            try {
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Primer número: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.print("Segundo número: ");
                    int b = Integer.parseInt(sc.nextLine());
                    switch(operacion) {
                        case 1:
                            resultado= suma(a, b);
                            mostrarResultadoFinal(resultado);
                        case 2:
                            resultado= resta(a,b);
                            mostrarResultadoFinal(resultado);
                        case 3:
                            resultado=multiplicacion(a,b);
                            mostrarResultadoFinal(resultado);
                        case 4:
                            resultado=division(a,b);
                            mostrarResultadoFinal(resultado);
                        case 5:
                            System.out.println("Saliendo de la calculadora, hasta pronto");
                        default:
                            System.out.println("Escoge una opción válida");
                    }
                }
            } catch (NumberFormatException e) {
            System.out.println("Entrada no válida");
            }
        }
    }
    
    public static double suma(int a, int b){
        double resultado;
        
        
        resultado = a + b;
        return resultado;
        
    }

    public static int resta(int a, int b){
        int resultado;
        resultado= a - b;
        return resultado;
    }
    
    public static void mostrarResultadoFinal(double resultado){
        System.out.println("El resultado es: " + resultado);
    }


    public static void mostrarMenu(){
        System.out.print("Elige una opción: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
     }
    
    public static int multiplicacion(int a, int b){
        int resultado;
        resultado = a*b;
        return resultado;
    }
    
    public static double division(double a, double b){
        double resultado;
        resultado = a/b;
        return resultado;
    }
}