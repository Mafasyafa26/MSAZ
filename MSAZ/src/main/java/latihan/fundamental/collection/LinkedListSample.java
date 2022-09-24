package latihan.fundamental.collection;

import java.util.ArrayList;
import java.util.LinkedList;

import latihan.fundamental.oop.ModelEncaps;

public class LinkedListSample {

	public static void main(String[] args) {
		LinkedList<ModelEncaps> me = new LinkedList<ModelEncaps>();
//		List<ModelEncaps> me = new ArrayList<ModelEncaps>();
		me.add(new ModelEncaps("Adith","Adithya","Pria"));
		me.add(new ModelEncaps("Manda","Alamanda","Wanita"));
		me.add(new ModelEncaps("Andhika Bagaskara","dikabagas","Pria"));
		me.add(new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria"));
		me.add(new ModelEncaps("Nisa","annisa","Wanita"));
		System.out.println(me.size());
		
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}

		System.out.println("============================================================");
		
		me.clear();
		ModelEncaps meObj = new ModelEncaps();
		meObj.setUserN("Adith");
		meObj.setPassword("Adithya");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj.setUserN("Manda");
		meObj.setPassword("Alamanda");
		meObj.setJenisKelamin("Wanita");
		me.add(meObj);
		
		meObj.setUserN("Andhika Bagaskara");
		meObj.setPassword("dikabagas");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj.setUserN("Ahyar Ibrahim");
		meObj.setPassword("boimkeren");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj.setUserN("Nisa");
		meObj.setPassword("Annisa");
		meObj.setJenisKelamin("Wanita");
		me.add(meObj);
		
		meObj.setUserN("Runanto");
		meObj.setPassword("Nanto");
		meObj.setJenisKelamin("Pria");
		me.set(0, meObj);
		me.remove(2);
//		ArrayList<String> cars = new ArrayList<>();
//		Collections.sort(me);
		
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}
	}
}