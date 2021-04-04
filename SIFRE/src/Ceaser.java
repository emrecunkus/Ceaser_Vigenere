
public class Ceaser extends Cipher{

	@Override
	String encrypt(String orjinalMetin, String anahtar) {
		  String result="";
		  int s = anahtar.length();
	        for (int i=0; i<orjinalMetin.length(); i++)
	        {
	            if (Character.isUpperCase(orjinalMetin.charAt(i)))
	            {
	                char ch = (char)(((int)orjinalMetin.charAt(i) +
	                                  s - 65) % 26 + 65);
	               
	                result = result+ch;
	            }
	            else
	            {
	                char ch = (char)(((int)orjinalMetin.charAt(i) +
	                                  s - 97) % 26 + 97);
	              
	                result = result+ch;
	            }
	        }
	        return result;
	}

	@Override
	String decrypt(String sifreliMetin, String anahtar) {
		  String result="";
		  int shift =26- anahtar.length();
	        for (int i = 0; i < sifreliMetin.length(); i++) {
	            if (Character.isUpperCase(sifreliMetin.charAt(i))) {
	                char ch = (char) (((int) sifreliMetin.charAt(i) +
	                        shift - 65) % 26 + 65);
	              
	                result = result+ch;
	            } else {
	                char ch = (char) (((int) sifreliMetin.charAt(i) +
	                        shift - 97) % 26 + 97);
	                
	                result = result+ch;
	            }
	        }
	        return result;
	
	}
}