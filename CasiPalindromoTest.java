/**
    * Fecha entrega: Jueves 14, 10 p.m.
    *
    * Ejercicio Casi Palíndromo
    *
    * Verificar si una palabra es casi palíndromo,
    * con el cambio de una sola letra.
    *
    * Ej.
    * Oso -> false ( por que ya es un palíndromo)
    * Ver -> true (si reemplazo la v por r -> vev)
    * Hola -> false (no es casi un palíndromio: holh, hooa)
    * Ocho -> true ( occo)
    * Veronica -> false ( veronicv, veroniea, veronrca, verooica)
    * Anita lavó la tina - > true ( Anita L[a]v[a] la tina )
    *
*/

package com.generation.math.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CasiPalindromoTest {
	
	public static boolean esCasiPalindromo(String palabra) {
	    // Se eliminan los espacios en blanco y se convierte la palabra a minúsculas
	    palabra = palabra.replaceAll(" ", "").toLowerCase();

	    // Se determina la longitud de la palabra
	    int longitud = palabra.length();

	    // Se inicializa una variable para contar los caracteres diferentes
	    int caracteresDiferentes = 0;

	    // Se itera desde ambos extremos de la palabra hacia el centro
	    for (int i = 0; i < longitud / 2; i++) {
	        char izquierda = palabra.charAt(i);
	        char derecha = palabra.charAt(longitud - 1 - i);

	        // Si los caracteres son diferentes, aumenta el contador de caracteres diferentes
	        if (izquierda != derecha) {
	            caracteresDiferentes++;

	            // Si se permiten más de un carácter diferente, la palabra no es casi palíndromo
	            if (caracteresDiferentes > 1) {
	                return false;
	            }
	        }
	    }

	    // Si se llega hasta aquí, la palabra es casi palíndromo
	    return caracteresDiferentes == 1;
		}

	 	@Test
	    public void testEsCasiPalindromoOso() {
	        assertFalse(CasiPalindromoTest.esCasiPalindromo("Oso"));
	    }

	 	@Test
	    public void testEsCasiPalindromoVer() {
	        assertTrue(CasiPalindromoTest.esCasiPalindromo("Ver"));
	    }
	 	
	    @Test
	    public void testEsCasiPalindromoHola() {
	        assertFalse(CasiPalindromoTest.esCasiPalindromo("Hola"));
	    }

	    @Test
	    public void testEsCasiPalindromoOcho() {
	        assertTrue(CasiPalindromoTest.esCasiPalindromo("Ocho"));
	    }

	    @Test
	    public void testEsCasiPalindromoVeronica() {
	        assertFalse(CasiPalindromoTest.esCasiPalindromo("Veronica"));
	    }
	    
	    @Test
	    public void testEsCasiPalindromoAnitaLavoLaTina() {
	        assertTrue(CasiPalindromoTest.esCasiPalindromo("Anita lavó la tina"));
	    }
	}