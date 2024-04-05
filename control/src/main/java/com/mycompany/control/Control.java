package com.mycompany.control;


import static com.mycompany.control.funciones.*;

public class Control {

    public static void main(String[] args) {
        // Toma de datos
        int num = tomarDatos();

        // Validación de que sea un entero y no una letra
        while (!validarEntero(num)) {
            num = tomarDatos();
        }

        // Aplicar la función recursiva para invertir el número
        int numInv = invertirNumero(num, 0);

        // Imprimir el resultado
        imprimirResultado(numInv);
    }
}
