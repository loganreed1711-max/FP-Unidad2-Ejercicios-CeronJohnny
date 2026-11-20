/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir sin variable static
 * Enunciado: Conservar el original en comentarios y reescribirlo con parámetros y return.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej04_ReescribirSinStatic {
    public static void main(String[] args) {
        int precio = 100;
        int cantidad = 3;
        double iva = 0.15;
        double total = calcularTotal(precio, cantidad, iva);
        System.out.printf("Total con IVA: %.2f%n", total);
    }

    /* Version original con atributos static:
    static int precio = 100;
    static int cantidad = 3;
    static double iva = 0.15;
    static double total() { return precio * cantidad * (1 + iva); }
    */
    static double calcularTotal(int precio, int cantidad, double iva) {
        return precio * cantidad * (1 + iva);
    }
}
