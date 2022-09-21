public class Main {
	public static void main(String[] args) {
		int sayi1 = 20, sayi2 = 25, sayi3 = 2, enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayı:" + enBuyuk);
		
		
		
		/* //Eşitlikleri kontrol etmediğim için eksik bir yapı.
		if(sayi1 > sayi2) {
		
			if(sayi1 > sayi3) {
				System.out.println("Sayi1 en büyük");
			}
			
			else {
				System.out.println("Sayi3 en büyük");
			}
			
		}
		
		else if (sayi2 > sayi3) {
			System.out.println("Sayi2 en büyük");
		}
		
		else {
			System.out.println("Sayi3 en büyük");
		}
		*/
	}
}
