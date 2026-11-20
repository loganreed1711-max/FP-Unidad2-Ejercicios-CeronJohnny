/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 02: Intercambiar elementos de un arreglo
 * Enunciado: Intercambiar dos elementos de un arreglo en los índices indicados.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class E2_IntercambiarArreglo {
    static void intercambiar(int[] v, int i, int j) {
        int temporal = v[i];
        v[i] = v[j];
        v[j] = temporal;
    }

    public static void main(String[] args) {
        int[] valores = {4, 8, 15, 16};
        System.out.println("Antes: " + Arrays.toString(valores));
        intercambiar(valores, 1, 3);
        System.out.println("Despues: " + Arrays.toString(valores));
        // Ahora si funciona porque se copia la referencia al mismo arreglo.
    }
}
