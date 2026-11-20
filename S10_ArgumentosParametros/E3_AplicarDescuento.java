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
         precios[i] = precios[i] * (1 - pct / 100);//APLICAMOS UN FOR PARA LA SECUENCIA
        }
    }

    public static void main(String[] args) {
        double[] precios = {100, 200, 300, 400, 500}; // AQUI AGREGAMOS LOS VALORES QUE LE VAMOS ASIGNAR LOS DESCUENTOS
  double pct = 15;
        System.out.println("ANTES: " + Arrays.toString(precios));
        aplicarDescuento(precios, pct);
        System.out.println("DESPUES: " + Arrays.toString(precios));
    }
}
