package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		String metin = "İlgili";
		System.out.println(metin);
		//camelCase kullan
		int vade = 12;
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		String okYonu;
		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		String[] krediler = {"Hızlı kredi", "Kredi 2", "Kredi Genç"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
	
}
