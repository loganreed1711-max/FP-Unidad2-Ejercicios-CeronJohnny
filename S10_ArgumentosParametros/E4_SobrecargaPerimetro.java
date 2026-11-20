/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 04: Sobrecarga de perímetro
 * Enunciado: Llamar desde main a las dos versiones del método perimetro.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class E4_SobrecargaPerimetro {
    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        System.out.println("Perimetro del cuadrado: " + perimetro(5));
        System.out.println("Perimetro del rectangulo: " + perimetro(4, 7));
    }
}
