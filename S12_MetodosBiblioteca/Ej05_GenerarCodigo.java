/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Generar un código de 6 caracteres
 * Enunciado: Generar un código con tres letras aleatorias y tres dígitos aleatorios.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {
    public static void main(String[] args) {
        Random azar = new Random();
        String codigo = "";
        for (int i = 0; i < 3; i++) {
            codigo += (char) ('A' + azar.nextInt(26));
        }
        for (int i = 0; i < 3; i++) {
            codigo += azar.nextInt(10);
        }
        System.out.println("Codigo generado: " + codigo);
    }
}
