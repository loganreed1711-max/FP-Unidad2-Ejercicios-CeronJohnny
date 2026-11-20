/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Anotar el ámbito de cada variable en el programa base.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {
    static int llamadas = 0; // atributo static: existe durante toda la ejecucion
    public static void main(String[] args) {
        int suma = 0; // variable local de main
        for (int i = 1; i <= 3; i++) { // variable de bloque: solo existe dentro del for
            suma += cuadrado(i);
        }
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas: " + llamadas);
    }

    static int cuadrado(int n) { // parametro local del metodo
        llamadas++;
        int resultado = n * n; // variable local: solo existe en cuadrado
        return resultado;
    }
}
