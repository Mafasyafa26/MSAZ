package latihan.fundamental.excepthand;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int x = 1/0;
			System.out.println("Statement : ");			
		}catch(Exception e)
		{
			System.err.println(e);
		}
		
		try {
			int x = 1/0;
			System.out.println("Statement : ");			
		}catch(NullPointerException e)
		{
			System.err.println(e);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e);
		}
		finally
		{
			System.out.println("INI PASTI DIEKSEKUSI");
		}
	}
}