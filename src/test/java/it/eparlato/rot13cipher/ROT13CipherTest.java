package it.eparlato.rot13cipher;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
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

	@Test
	public void should_return_g_if_input_is_t() throws Exception {
		assertEquals("g", ROT13Cipher.transform("t"));
	}

	@Test
	public void should_return_JeDi_if_input_is_WrQv() throws Exception {
		assertEquals("JeDi", ROT13Cipher.transform("WrQv"));
	}

	// "rkgerzr" => "extreme"

	// "EXTREME" => "RKGERZR"

	public static class ROT13Cipher {

		public static String transform(String input) {
			if (input == null || input.isEmpty()) {
				return "";
			} else {

				StringBuilder output = new StringBuilder("");

				for (int i = 0; i < input.length(); i++) {
					char inputAsChar = input.charAt(i);

					if (inputAsChar >= 'A' && inputAsChar <= 'M') {
						output.append((char) (inputAsChar + 13));
					} else if (inputAsChar >= 'N' && inputAsChar <= 'Z') {
						output.append((char) (inputAsChar - 13));
					} else if (inputAsChar >= 'a' && inputAsChar <= 'm') {
						output.append((char) (inputAsChar + 13));
					} else if (inputAsChar >= 'n' && inputAsChar <= 'z') {
						output.append((char) (inputAsChar - 13));
					}
				}

				return output.toString();
			}
		}

	}
}
