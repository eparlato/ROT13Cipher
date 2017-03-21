package it.eparlato.rot13cipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class ROT13CipherTest {

	@Test
	public void should_return_empty_if_input_is_null() throws Exception {
		assertEquals("", ROT13Cipher.transform(null));
	}

	// "" => ""

	// "A" => "N"
	@Test
	public void should_return_N_if_input_is_A() throws Exception {
		assertEquals("N", ROT13Cipher.transform("A"));
	}

	// "F" => "S"

	// "Z" => "M"

	// "b" => "o"

	// "JeDi" => "WrQv"

	// "rkgerzr" => "extreme"

	// "EXTREME" => "RKGERZR"

	public static class ROT13Cipher {

		public static String transform(String input) {
			if (input == null) {
				return "";
			} else {
				return "N";
			}
		}

	}
}
