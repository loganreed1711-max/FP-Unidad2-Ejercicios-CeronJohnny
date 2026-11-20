/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: Simular 1000 lanzamientos y mostrar cuántas veces los dados suman 7 y su porcentaje.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class E2_DadosSuma7 {
    public static void main(String[] args) {
        Random azar = new Random();
        int exitos = 0;
        int lanzamientos = 1000;
        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = azar.nextInt(6) + 1;
      int dado2 = azar.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                exitos++;        }
        }
        double porcentaje = exitos * 100.0 / lanzamientos;
        System.out.println("Veces que la suma ffue 7: " + exitos);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}
