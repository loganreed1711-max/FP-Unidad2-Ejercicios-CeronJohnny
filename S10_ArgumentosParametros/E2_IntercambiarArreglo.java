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
        int temporal = v[i]; //aqui hacemos lo mismo que el ejercicio 1
       v[i] = v[j];         // asignamos los valores creando un temporal 
      v[j] = temporal;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};
        System.out.println("Antes: " + Arrays.toString(valores));
  intercambiar(valores, 0, 4);  // aqui le ponemos 0 por que la secuencia empieza desde 0 y 4
        System.out.println("Despues: " + Arrays.toString(valores));
    
    }
}
