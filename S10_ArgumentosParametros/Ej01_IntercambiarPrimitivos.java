/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: Demostrar el efecto de intercambiar dos argumentos int.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej01_IntercambiarPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Antes: a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Despues: a = " + a + ", b = " + b);
        // No funciona para cambiar a y b en main: Java copia los valores primitivos.
    }

    static void intercambiar(int a, int b) {
        int temporal = a;
        a = b;
        b = temporal;
        System.out.println("Dentro del metodo: a = " + a + ", b = " + b);
    }
}
