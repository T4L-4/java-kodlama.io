public class Main {
	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A': {
			System.out.println("Geçtin: Mükemmel!");
			break;
		}
		case 'B': {
			System.out.println("Geçtin: İdare eder.");
			break;
		}
		case 'C':
		case 'D': {
			System.out.println("Kaldın: Bir daha dene.");
			break;
		}
		default:
			System.out.println("Yanlış harf notu girdin.");
		}
	}
}