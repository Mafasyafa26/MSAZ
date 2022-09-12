package latihan.testng;

public class ShoppingActivity {
	
	IndomaretPrototype ip;
	int limitProdSatu = 0;
	
	public ShoppingActivity() 
	{
		ip = new IndomaretPrototype("Minyak", "Regal", 10000, 5000, 0.05);
	}
	
	public int addProdSatu() 
	{
		ip.setJumlahProdukSatu(ip.getJumlahProdukSatu()+1);
		ip.setTotalDiskon(ip.getDiskon()*ip.getHargaProdukSatu());
		ip.setTotalBelanja((ip.getHargaProdukSatu()+ip.getTotalBelanja()));
		
		return ip.getTotalBelanja();
	}
	
	public int kurangProdSatu() 
	{
		if(ip.getJumlahProdukSatu()!=0) {
			ip.setJumlahProdukSatu(ip.getJumlahProdukSatu()-1);
			ip.setTotalDiskon(ip.getTotalDiskon()-(ip.getDiskon()*ip.getHargaProdukSatu()));
			ip.setTotalBelanja(ip.getTotalBelanja()-ip.getHargaProdukSatu());
		}

		return ip.getTotalBelanja();
	}
	
	public double hitungTotalBelanja()
	{
		System.out.println("TOTAL BELANJA ADALAH " +(ip.getTotalBelanja()-ip.getTotalDiskon()));;
		return ip.getTotalBelanja() - ip.getTotalDiskon();
	}
	
}
