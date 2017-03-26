package it.eparlato.rot13cipher;

public class ROT13Cipher {

	/**
	 * Returns a String encoded with the ROT13 algorithm. 
	 * 
	 * ROT13 algorithm replaces each lowercase and UPPERCASE letter with the letter 13 positions
	 * after it. English alphabet is used. <br/>
	 * <br/>
	 * 'A' becomes 'N', 'B' becomes 'O' and so forth.<br/>
	 * When the end of the alphabet is reached, the sequence starts back from a.<br/>
	 * 'N' becomes 'A', 'U' becomes 'H', 'Z' becomes 'M'.
	 * 
	 * @param input	the input string
	 * @return		the input string encoded with ROT13 algorithm.
	 */
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