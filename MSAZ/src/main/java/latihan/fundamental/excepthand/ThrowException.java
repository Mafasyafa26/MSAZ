package latihan.fundamental.excepthand;

public class ThrowException {

	public static void main(String[] args) {
		try {
			validate(12);
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
	static void validate(int age) throws Exception
	{
		if(age < 14)
		{
			throw new Exception("UMUR TIDAK VALID");
//			System.out.println("UMUR TIDAK VALID");
		}
		else
		{
			System.out.println("UMUR VALID");
		}
//		System.out.println("VALID");
	}
}