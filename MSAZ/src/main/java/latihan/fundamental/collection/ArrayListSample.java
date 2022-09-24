package latihan.fundamental.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import latihan.fundamental.oop.ModelEncaps;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList <String> eList = new ArrayList<String>();
		List<ModelEncaps> me = new ArrayList<ModelEncaps>();
		me.add(new ModelEncaps("Adith","Adithya","Pria"));
		me.add(new ModelEncaps("Manda","Alamanda","Wanita"));
		me.add(new ModelEncaps("Andhika Bagaskara","dikabagas","Pria"));
		me.add(new ModelEncaps("Ahyar Ibrahim","boimkeren","Pria"));
		me.add(new ModelEncaps("Nisa","annisa","Wanita"));
		System.out.println(me.size());
		
//		eList.add(new ModelEncaps("Adith","Adithya","Pria"));
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}
		
		System.out.println("============================================================");
		ModelEncaps meObj ;
		int x = 0;
		x = 4;
		//AMBIL 4 DISINI
		x = 5;
		//AMBIL 5 DISINI
		x = 6;
		//AMBIL 6 DISINI
		x = 7;
		
		me.clear();
		for(int i=0;i<me.size();i++)
		{
			meObj = new ModelEncaps();
			meObj.setUserN("Adith");//A
			meObj.setPassword("Adithya");
			meObj.setJenisKelamin("Pria");
			me.add(meObj);
			
		}
		meObj = new ModelEncaps();
		meObj.setUserN("Adith");//A
		meObj.setPassword("Adithya");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj = new ModelEncaps();
		meObj.setUserN("Manda");
		meObj.setPassword("Alamanda");
		meObj.setJenisKelamin("Wanita");
		me.add(meObj);
		
//		meObj = new ModelEncaps();
		meObj.setUserN("Andhika Bagaskara");
		meObj.setPassword("dikabagas");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj = new ModelEncaps();
		meObj.setUserN("Ahyar Ibrahim");
		meObj.setPassword("boimkeren");
		meObj.setJenisKelamin("Pria");
		me.add(meObj);
		
		meObj = new ModelEncaps();
		meObj.setUserN("Nisa");
		meObj.setPassword("Annisa");
		meObj.setJenisKelamin("Wanita");
		me.add(meObj);		
		
//		meObj = new ModelEncaps();
//		meObj.setUserN("Runanto");
//		meObj.setPassword("Nanto");
//		meObj.setJenisKelamin("Pria");
//		me.set(0, meObj);
//		me.remove(2);
		ArrayList<String> cars = new ArrayList<>();
		Collections.sort(cars);
		
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}
		
		System.out.println("============================================================");
		meObj = new ModelEncaps();
		meObj.setUserN("Runanto");
		meObj.setPassword("Nanto");
		meObj.setJenisKelamin("Pria");
		me.set(2, meObj);
		
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}
		System.out.println("============================================================");
		me.remove(2);
		for(int i=0;i<me.size();i++)
		{
			System.out.println(me.get(i).getUserN()+"===="+me.get(i).getPassword()+"===="+me.get(i).getJenisKelamin());
		}
		
		int intLoop= 0;
		for(ModelEncaps f: me)
		{
			//me.get(i).
			if(intLoop==2)
			{
				f.setUserN("BOIM");
			}
			System.out.println(f.getUserN()+"===="+f.getPassword()+"===="+f.getJenisKelamin());
			intLoop++;
		}
		me.clear();
	}
}