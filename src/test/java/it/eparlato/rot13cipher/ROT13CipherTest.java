package it.eparlato.rot13cipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class ROT13CipherTest {

	@Test
	public void should_return_empty_if_input_is_null() throws Exception {
		assertEquals("", ROT13Cipher.transform(null));
	}

	@Test
	public void should_return_empty_if_input_is_empty() throws Exception {
		assertEquals("", ROT13Cipher.transform(""));
	}

	@Test
	public void should_return_N_if_input_is_A() throws Exception {
		assertEquals("N", ROT13Cipher.transform("A"));
	}

	@Test
	public void should_return_S_if_input_is_F() throws Exception {
		assertEquals("S", ROT13Cipher.transform("F"));
	}

	@Test
	public void should_return_M_if_input_is_Z() throws Exception {
		assertEquals("M", ROT13Cipher.transform("Z"));
	}

	@Test
	public void should_return_o_if_input_is_b() throws Exception {
		assertEquals("o", ROT13Cipher.transform("b"));
	}

	// "JeDi" => "WrQv"

	// "rkgerzr" => "extreme"

	// "EXTREME" => "RKGERZR"

	public static class ROT13Cipher {

		public static String transform(String input) {
			if (input == null || input.isEmpty()) {
				return "";
			} else {
				char inputAsChar = input.charAt(0);
				
				if(inputAsChar >= 'A' && inputAsChar <= 'M') {
					return "" + (char)(inputAsChar + 13);
				} else if( inputAsChar >= 'N' && inputAsChar <= 'Z') {
					return "" + (char)(inputAsChar - 13);
				} else if(inputAsChar >= 'a' && inputAsChar <= 'm') {
					return "" + (char)(inputAsChar + 13);
				}
				
				return "";
			}
		}

	}
}
