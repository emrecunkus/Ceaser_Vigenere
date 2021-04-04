import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("ORÝJÝNAL METNÝ GÝRÝNÝZ:");
		String sentence = scan.nextLine();
		System.out.println("ANAHTAR GÝRÝNÝZ:");
		String key = scan.nextLine();
		
		
		
	
	Ceaser ceaser = new Ceaser();
	System.out.println("CEASER");
	System.out.println("Orijinal metin: "+sentence +", anahtar:"+ key+ ", Sifreli Metin:"+ceaser.encrypt(sentence, key) );
	String sifreli = ceaser.encrypt(sentence, key).toString();
	System.out.println("Þifreli Metin: "+ sifreli + ", anahtar:"+ key +", Orijinal metin: "+ ceaser.decrypt(sifreli, key));
	System.out.println("************");
	
	Vigenere vigenere = new Vigenere();
	System.out.println("VIGENERE");
	System.out.println("Orijinal metin: "+sentence +", anahtar:"+ key+ ", Sifreli Metin:"+vigenere.encrypt(sentence, key) );
	String sifreliVigenere = vigenere.encrypt(sentence, key).toString();
	System.out.println("Þifreli Metin: "+ sifreliVigenere + ", anahtar:"+ key +", Orijinal metin: "+ vigenere.decrypt(sifreliVigenere, key));
	
	
	
	
	
	
	

	}

}
