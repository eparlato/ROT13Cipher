package it.eparlato.rot13cipher;

public class ROT13Cipher {

	// TODO: java doc of the method
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
	
	public static void main(String[] args) {
		System.out.println(ROT13Cipher.transform("rkgerzr"));
	}

}