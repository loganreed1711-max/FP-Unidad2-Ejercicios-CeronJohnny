/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: Registrar las variables vivas y su valor en cada línea relevante.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class E3_TrazaContadorStatic {
    static int contador = 0;
    static void contar(int valor) {
    contador++;
        System.out.println("Llamada " + valor + ", contador = " + contador);
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            contar(i);
}
        System.out.println("Contadorr final: " + contador);
    }
}
