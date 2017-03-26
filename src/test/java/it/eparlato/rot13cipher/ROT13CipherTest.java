package it.eparlato.rot13cipher;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void should_return_extreme_if_input_is_rkgerzr() throws Exception {
		assertEquals("extreme", ROT13Cipher.transform("rkgerzr"));
	}

	@Test
	public void should_return_RKGErZR_if_input_is_EXTReME() throws Exception {
		assertEquals("RKGErZR", ROT13Cipher.transform("EXTReME"));
	}
}
