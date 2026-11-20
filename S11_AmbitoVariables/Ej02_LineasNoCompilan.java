/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: Identificar y comentar las líneas con error junto con su diagnóstico y causa.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 3; i++) {
            total += i;
        }
        // System.out.println(i);
        // Error: cannot find symbol. Causa: i es una variable de bloque del for.
        System.out.println("Total: " + total);
        mostrarTotal(total);
        // System.out.println(resultado);
        // Error: cannot find symbol. Causa: resultado es local de mostrarTotal.
    }

    static void mostrarTotal(int valor) {
        int resultado = valor * 2;
        System.out.println("Doble: " + resultado);
    }
}
