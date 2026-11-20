/*
S10: Argumentos y parámetros
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: Demostrar el efecto de intercambiar dos argumentos int.
 * Autor: Johnny Ceron
 * Fecha: 20/11/2026
 */


public class E1_IntercambiarPrimitivos {
    public static void intercambiar(int a, int b){
        a =8;
        b = 19;

        System.out.println("ANTES: ");
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);
        
        int intercambio = a;
        a = b; 
        b = intercambio;
        
        System.out.println("DESPUES: ");
        System.out.println(" a = "+ a);
        System.out.println(" b = "+ b);
    }
    public static void main (String[] args){
        intercambiar(8, 19);
    }
}
