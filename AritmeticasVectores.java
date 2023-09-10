package com.mycompany.aritmeticas.vectores;
import java.util.Scanner;
public class AritmeticasVectores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE OPERACIONES");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Porcentaje");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 5:
                    realizarPorcentaje();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int resta = vector[0];
        for (int i = 1; i < n; i++) {
            resta -= vector[i];
        }

        System.out.println("La resta de los elementos del vector es: " + resta);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int multiplicacion = 1;
        for (int i = 0; i < n; i++) {
            multiplicacion *= vector[i];
        }

        System.out.println("La multiplicación de los elementos del vector es: " + multiplicacion);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            double division = (double) dividendo / divisor;
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    public static void realizarPorcentaje() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el porcentaje a calcular: ");
        int porcentaje = scanner.nextInt();

        double porcentajeDecimal = (double) porcentaje / 100;
        double resultado = vector[0] * porcentajeDecimal;

        System.out.println("El " + porcentaje + "% del primer elemento del vector es: " + resultado);
    }
}