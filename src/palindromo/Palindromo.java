/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author leonel
 */
public class Palindromo {

    // Metodo publico o wrapper
    public static boolean esPalindromo(String texto) {

        // Validar si la cadena es nula
        if (texto == null) {
            return false;
        }

        // Normalizar el texto: minusculas y sin espacios
        texto = texto.toLowerCase().replaceAll("\\s+", "");

        // Llamar al metodo auxiliar recursivo
        return esPalindromoHelper(texto, 0, texto.length() - 1);
    }

    // Metodo privado auxiliar recursivo
    private static boolean esPalindromoHelper(
            String texto, int inicio, int fin) {

        // Caso base: llegamos al centro
        if (inicio >= fin) {
            return true;
        }

        // Si los caracteres no coinciden
        if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        }

        // Llamada recursiva avanzando hacia el centro
        return esPalindromoHelper(texto, inicio + 1, fin - 1);
    }

    // Metodo principal
    public static void main(String[] args) {

        String[] pruebas = {
            "reconocer",
            "radar",
            "casa",
            "Anita lava la tina",
            "",
            "a"
        };

        for (String palabra : pruebas) {
            System.out.println(
                "\"" + palabra + "\" -> " + esPalindromo(palabra)
            );
        }
    }
    
}
