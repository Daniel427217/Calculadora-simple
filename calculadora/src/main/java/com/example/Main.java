package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Paso 2: declaración de variables

        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        char operacion;

        // Paso 3: Entrada de datos 

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero:");
        numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        numero2 = sc.nextDouble();
        System.out.println("Ingrese la operación a realizar (+, -, *, /, %):");
        operacion = sc.next().charAt(0);

        //Paso 4: Operaciónes básicas

        if (operacion == '+') {
            resultado = numero1 + numero2;

        } else if (operacion == '-') {
            resultado = numero1 - numero2;

        } else if (operacion == '*') {
            resultado = numero1 * numero2;
            

        } else if (operacion == '/') {
                resultado = numero1 / numero2;

        if (operacion !=0) {
            System.out.println("No es posible realizar la operación");
        }
        
        }

        // Paso 5: Mostrar resultado
        
        System.out.println("El total de su operación es: " + resultado);

        // Paso 6: Comparación de numeros
        if (numero1 > numero2) {
            System.out.println("El numero uno es mayor que el segundo ");

        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor que el numero uno ");

        } else {
            System.out.println("Los números tienen el mismo valor ");
        }

        // Paso 7: Par o impar
        if (resultado % 2 == 0) {
            System.out.println("El resultado es par ");

        } else {
            System.out.println("El resultado es impar ");
        }

        // Paso 8: Conversión de tipos
        int resultadoEntero = (int) resultado;
        System.out.println("El resultado convertido a entero es: " + resultadoEntero);

        // Paso 9: Operadores logicos

        if (numero1 > 10 && numero2 > 10) {
            System.out.println("Los dos numeros son positivos y mayores a 10");

        } else if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Uno de los dos numeros es negativo o igual a cero");
        }
    }
}

