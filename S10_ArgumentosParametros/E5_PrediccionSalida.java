/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 05: Predicción de salida
 * Enunciado: Predecir y verificar la salida de un programa con tres llamadas.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class E5_PrediccionSalida {
    static void aumentar(int n) {
        n += 5;
        System.out.println("Dentro: " + n);
    }

    static int aumentarYDevolver(int n) {
        n += 2;
        System.out.println("Dentro: " + n);
        return n;
    }

    public static void main(String[] args) {
        // Salida predicha:
        // Dentro: 8
        // En main: 3
        // Dentro: 5
        // Dentro: 10
        // En main: 5
        int numero = 3;
        aumentar(numero);                 // primera llamada
        System.out.println("En main: " + numero);
        numero = aumentarYDevolver(numero); // segunda llamada
        aumentar(numero);                 // tercera llamada
        System.out.println("En main: " + numero);
    }
}
