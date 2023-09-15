 /*
    * Fecha entrega: Jueves 14, 10 p.m.
    *
    * Verificar el primer caracter de entrada e indicar con un string el tipo
    * de dato.
    *
    * "12 street" -> "Number"
    * "Hola" -> "Mayus"
    * "crayoli" -> "Minus"
    * "#ch30" -> "Other"
    *
 */

package com.generation.math.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TipoDeDatoTest {

    // Método para determinar el tipo de dato del primer carácter de una palabra
    public static String determinarTipoDato(String palabra) {
        // Verificar si la palabra es nula o vacía
        if (palabra == null || palabra.isEmpty()) {
            return "Empty"; // Devolver "Empty" si la palabra es nula o vacía
        }

        char primerCaracter = palabra.charAt(0);

        // Verificar si el primer carácter es un dígito numérico
        if (Character.isDigit(primerCaracter)) {
            return "Number"; // Devolver "Number" si el primer carácter es un número
        }
        // Verificar si el primer carácter es una letra mayúscula
        else if (Character.isUpperCase(primerCaracter)) {
            return "Mayus"; // Devolver "Mayus" si el primer carácter es una letra mayúscula
        }
        // Verificar si el primer carácter es una letra minúscula
        else if (Character.isLowerCase(primerCaracter)) {
            return "Minus"; // Devolver "Minus" si el primer carácter es una letra minúscula
        } else {
            return "Other"; // Devolver "Other" si el primer carácter no cumple con ninguna de las anteriores
        }
    }

    // Pruebas unitarias
    @Test
    public void testDeterminarTipoDatoNumero() {
        String resultado = determinarTipoDato("12 street");
        assertEquals("Number", resultado);
    }

    @Test
    public void testDeterminarTipoDatoMayuscula() {
        String resultado = determinarTipoDato("Hola");
        assertEquals("Mayus", resultado);
    }

    @Test
    public void testDeterminarTipoDatoMinuscula() {
        String resultado = determinarTipoDato("crayoli");
        assertEquals("Minus", resultado);
    }

    @Test
    public void testDeterminarTipoDatoOtro() {
        String resultado = determinarTipoDato("#ch30");
        assertEquals("Other", resultado);
    }

    @Test
    public void testDeterminarTipoDatoEmpty() {
        String resultado = determinarTipoDato("");
        assertEquals("Empty", resultado);
    }
    
}
