/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: Anotar el ámbito de cada variable en el programa base.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class E1_MarcarAmbito {
    static int llamadas = 0; // NO CAMBIA
static int cuadrado(int n) { // parametro local del metodo
        llamadas++;
int resultado = n* n; 
        return resultado;
    }

    public static void main(String[] args) {
        int suma =0; 
     for (int i = 1; i <= 3; i++) { // variable de solo para for
            suma = suma +cuadrado(i);
       }
        System.out.println("Suma de cuadrados: " + suma);
        System.out.println("Llamadas: " + llamadas);
    }
}
