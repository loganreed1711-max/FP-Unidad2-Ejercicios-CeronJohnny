/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: Comprobar longitud mínima de 8, una mayúscula y un dígito mediante Character.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */

public class Ej03_ValidarContrasena {
    public static void main(String[] args) {
        String contrasena = "Clave2026";
        System.out.println("Contrasena: " + contrasena);
        System.out.println("Es valida: " + esValida(contrasena));
    }

    static boolean esValida(String texto) {
        boolean mayuscula = false;
        boolean digito = false;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayuscula = true;
            }
            if (Character.isDigit(caracter)) {
                digito = true;
            }
        }
        return texto.length() >= 8 && mayuscula && digito;
    }
}
