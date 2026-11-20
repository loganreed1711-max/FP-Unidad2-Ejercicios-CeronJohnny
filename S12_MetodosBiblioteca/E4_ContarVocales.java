/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: Usar String y Character para contar vocales mayúsculas y minúsculas.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class E4_ContarVocales {
    static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String frase = "Ingenieria en TICS";
        int vocales = contarVocales(frase);
        System.out.println("Frase: " + frase);
        System.out.println("Cantidad de vocales: " + vocales);
    }
}
