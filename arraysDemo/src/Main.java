public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Salim";
		ogrenciler[1] = "Ayşe";
		ogrenciler[2] = "Melda";
		ogrenciler[3] = "Mert";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------");
		
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		
		/*
		String[] ogrenciler = {"Salim", "Ayşe", "Melda", "Mert"};
		for (String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		*/
		
	}

}
