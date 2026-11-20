/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entregable2;
import java.util.InputMismatchException;
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
        int a=0;
        int b=0;
        while (opcion != 5) {
            try {
                mostrarMenu();
                opcion = sc.nextInt();
                    if(opcion>0&&opcion<5){
                        System.out.println("Primer número: ");
                    a = sc.nextInt();
                    System.out.println("Segundo número: ");
                    b = sc.nextInt();
                    }
                    switch(opcion) {
                        case 1:
                            resultado= suma(a, b);
                            mostrarResultadoFinal(resultado);
                            break;
                        case 2:
                            resultado= resta(a,b);
                            mostrarResultadoFinal(resultado);
                            break;
                        case 3:
                            resultado=multiplicacion(a,b);
                            mostrarResultadoFinal(resultado);
                            break;
                        case 4:
                            resultado=division(a,b);
                            mostrarResultadoFinal(resultado);
                            break;
                        case 5:
                            System.out.println("Saliendo de la calculadora, hasta pronto");
                            break;
                        default:
                            System.out.println("Escoge una opción válida");
                            break;
                    }
                
            } catch (InputMismatchException e) {
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
        System.out.println("Elige una opción: ");
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