package latihan.fundamental.wrapper;

public class DetectingAlphabeticCharacter {

	public static void main(String[] args) {
		Character number = '1';
		System.out.println(Character.isAlphabetic(number));

		Character hurup = 'b';
		System.out.println(Character.isAlphabetic(hurup));
	}
}