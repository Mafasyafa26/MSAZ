package latihan.fundamental.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import latihan.fundamental.oop.ModelEncaps;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<ModelEncaps> me = new HashSet<ModelEncaps>();//		
		me.add(new ModelEncaps("Adith","Adithya","Pria"));
		me.add(new ModelEncaps("Manda","Alamanda","Wanita"));
		me.add(new ModelEncaps("Andhika Bagaskara","dikabagas","Pria"));
		me.add(new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria"));
		me.add(new ModelEncaps("Nisa","annisa","Wanita"));
		System.out.println(me.size());
		
//		List<ModelEncaps> ls = new ArrayList<ModelEncaps>(me);
//		for(int i=0;i<me.size();i++)
//		{
//			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
////			System.out.println(ls.get(i).getUserN());
//		}
//
//		System.out.println("============================================================");
//		
//		me.clear();
//		ModelEncaps meObj = new ModelEncaps();
//		meObj.setUserN("Adith");
//		meObj.setPassword("Adithya");
//		meObj.setJenisKelamin("Pria");
//		me.add(meObj);
//		
//		meObj.setUserN("Manda");
//		meObj.setPassword("Alamanda");
//		meObj.setJenisKelamin("Wanita");
//		me.add(meObj);
//		
//		meObj.setUserN("Andhika Bagaskara");
//		meObj.setPassword("dikabagas");
//		meObj.setJenisKelamin("Pria");
//		me.add(meObj);
//		
//		meObj.setUserN("Ahyar Ibrahim");
//		meObj.setPassword("boimkeren");
//		meObj.setJenisKelamin("Pria");
//		me.add(meObj);
//		
//		meObj.setUserN("Nisa");
//		meObj.setPassword("Annisa");
//		meObj.setJenisKelamin("Wanita");
//		me.add(meObj);
//		
//		meObj.setUserN("Runanto");
//		meObj.setPassword("Nanto");
//		meObj.setJenisKelamin("Pria");
//		me.set(0, meObj);
//		me.remove(2);
//		ArrayList<String> cars = new ArrayList<>();
//		Collections.sort(me);		
//		for(int i=0;i<me.size();i++)
//		{
//			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
//		}
		
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("A");
		hs.add("A");
		hs.add("C");
		
		System.out.println(hs.size());
		System.out.println(hs);	
	}
}
