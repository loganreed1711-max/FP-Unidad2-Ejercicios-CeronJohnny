/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 03: Aplicar descuento
 * Enunciado: Modificar el arreglo de precios e imprimirlo antes y después.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

import java.util.Arrays;

public class E3_AplicarDescuento {
    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * (1 - pct / 100);
        }
    }

    public static void main(String[] args) {
        double[] precios = {12.50, 25.00, 8.75, 40.00};
        double porcentaje = 15;
        System.out.println("Antes: " + Arrays.toString(precios));
        aplicarDescuento(precios, porcentaje);
        System.out.println("Despues de " + porcentaje + "%: " + Arrays.toString(precios));
    }
}
