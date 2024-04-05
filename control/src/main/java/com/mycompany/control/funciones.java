package com.mycompany.control;


import java.util.Scanner;

public class funciones {

    public static int tomarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero válido.");
            scanner.next();
        }
        int num = scanner.nextInt();
        return num;
    }

    public static boolean validarEntero(int num) {
        if (num < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
            return false;
        }
        return true;
    }

    public static int invertirNumero(int num, int invertido) {
        if (num == 0) {
            return invertido;
        } else {
            invertido = invertido * 10 + num % 10;
            return invertirNumero(num / 10, invertido);
        }
    }

    public static void imprimirResultado(int num) {
        System.out.println("El número invertido es: " + num);
    }
}