
public class Vigenere extends Cipher {

	@Override
	String encrypt(String orjinalMetin, String anahtar) {
		 String res = "";
		 orjinalMetin = orjinalMetin.toUpperCase();
	        for (int i = 0, j = 0; i < orjinalMetin.length(); i++)
	        {
	            char c = orjinalMetin.charAt(i);
	            if (c < 'A' || c > 'Z')
	                continue;
	            res += (char) ((c + anahtar.charAt(j) - 2 * 'A') % 26 + 'A');
	            j = ++j % anahtar.length();
	        }
	        return res;
	}

	@Override
	String decrypt(String sifreliMetin, String anahtar) {
		
		  String res = "";
		  sifreliMetin = sifreliMetin.toUpperCase();
	        for (int i = 0, j = 0; i < sifreliMetin.length(); i++)
	        {
	            char c = sifreliMetin.charAt(i);
	            if (c < 'A' || c > 'Z')
	                continue;
	            res += (char) ((c - anahtar.charAt(j) + 26) % 26 + 'A');
	            j = ++j % anahtar.length();
	        }
	        return res;
	}

}
