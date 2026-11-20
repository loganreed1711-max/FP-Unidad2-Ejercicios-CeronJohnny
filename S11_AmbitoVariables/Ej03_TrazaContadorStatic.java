/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: Registrar las variables vivas y su valor en cada línea relevante.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej03_TrazaContadorStatic {
    static int contador = 0;
    public static void main(String[] args) {
        // Traza:
        // linea                 | variables vivas            | contador
        // inicio de main        | contador                   | 0
        // llamada contar(1)     | contador, i, valor         | 1
        // llamada contar(2)     | contador, i, valor         | 2
        // llamada contar(3)     | contador, i, valor         | 3
        for (int i = 1; i <= 3; i++) {
            contar(i);
        }
        System.out.println("Contador final: " + contador);
    }

    static void contar(int valor) {
        contador++;
        System.out.println("Llamada " + valor + ", contador = " + contador);
    }
}
