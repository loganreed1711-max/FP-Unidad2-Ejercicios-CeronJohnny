/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: Calcular la distancia con Math.sqrt y Math.pow.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 2;
        double x2 = 7;
        double y2 = 10;
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distancia entre los puntos: %.2f%n", distancia);
    }
}
