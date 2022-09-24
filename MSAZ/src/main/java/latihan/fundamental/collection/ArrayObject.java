package latihan.fundamental.collection;

import latihan.fundamental.oop.ModelEncaps;

public class ArrayObject {

	public static void main(String[] args) {
		ModelEncaps [] me = new ModelEncaps[5];		
		ModelEncaps m = new ModelEncaps();
		m.setUserN("Adith");
		m.setPassword("Adithya");
		m.setJenisKelamin("Pria");
		me[0] = m;
		me[0].getUserN();
		me[0].getPassword();
		me[0].getJenisKelamin();
		System.out.println(me[0].getUserN()+"===="+me[0].getPassword()+"===="+me[0].getJenisKelamin());
		
		me[0]=new ModelEncaps("Adith","Adithya","Pria");
		me[1]=new ModelEncaps("Manda","Alamanda","Wanita");
		me[2]=new ModelEncaps("Andhika Bagaskara","dikabagas","Pria");
		me[3]=new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria");
		me[4]=new ModelEncaps("Nisa","annisa","Wanita");
		
		System.out.println(me.length);
		for(int i=0;i<me.length;i++)
		{
			System.out.println(me[i].getUserN()+"===="+me[i].getPassword()+"===="+me[i].getJenisKelamin());
		}
		
		int [] intA = new int[4];
		System.out.println(intA);
		intA[4] = 1;
		
		
		
	}
}