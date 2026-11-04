/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entregable2;
import java.util.Scanner;

public class Entregable2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double num1 = 0;
       double num2 = 0;
       suma(sc, num1, num2);
    }
    
    public static void suma(Scanner sc, double num1, double num2){
        double resultado;
        System.out.println("Introduzca el primer sumando: ");
        num1 = sc.nextDouble();
        System.out.println("Introduzca el segundo sumando: ");
        num2 = sc.nextDouble();
        
        resultado = num1 + num2;
        
        System.out.println("El resultado es: " + resultado);
    }
}
