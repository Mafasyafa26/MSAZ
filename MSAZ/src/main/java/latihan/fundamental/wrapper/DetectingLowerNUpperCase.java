package latihan.fundamental.wrapper;

public class DetectingLowerNUpperCase {
	public static void main(String[] args) {
		Character karakter = 'B';
		System.out.println(Character.isUpperCase(karakter));

		Character hurup = 'b';
		System.out.println(Character.isLowerCase(hurup));
	}
}