package latihan.lambda;

public class Lambda {
	
	public static void main(String args[]) {
//		Sayable s = ()->{
//			return "INI ADALAH LAMBDA";
//		};
//		
//		String strSay = s.say();
//		System.out.println(strSay);
		
		CountzAble x = (p) -> {return p*2;};
		System.out.println(x.countz(9));
		
	}

}
