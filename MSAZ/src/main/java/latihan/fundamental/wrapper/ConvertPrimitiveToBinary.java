package latihan.fundamental.wrapper;

public class ConvertPrimitiveToBinary {

	public static void main(String[] args) {
		int angka = 118;

		System.out.println(Integer.toBinaryString(angka));
		System.out.println(Integer.toHexString(angka));
		System.out.println(Integer.toOctalString(angka));
	}
}