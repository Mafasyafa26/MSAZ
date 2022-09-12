package latihan.testng;

public class IndomaretPrototype {
	
	private String produkSatu; //statis
	private int hargaProdukSatu; //statis
	private String produkDua; //statis
	private int hargaProdukDua; //statis
	private int jumlahProdukSatu; //dinamis
	private int jumlahProdukDua; //dinamis
	private int totalBelanja; //dinamis
	private double diskon; //statis
	private double totalDiskon; //dinamis
	
	IndomaretPrototype(String prodSatu, String prodDua, int hargaProdSatu, int hargaProdDua, double diskons){
		this.produkSatu = prodSatu;
		this.produkDua = prodDua;
		this.hargaProdukSatu = hargaProdSatu;
		this.hargaProdukDua = hargaProdDua;
		this.diskon = diskons;
		
//		get aja, karena dia gaakan berubah
		
		this.jumlahProdukSatu = 0;
		this.jumlahProdukDua = 0; 
		this.totalBelanja = 0;
		this.totalDiskon = 0;
		
//		getset
	}

	public String getProdukSatu() {
		return produkSatu;
	}

	public int getHargaProdukSatu() {
		return hargaProdukSatu;
	}

	public String getProdukDua() {
		return produkDua;
	}

	public int getHargaProdukDua() {
		return hargaProdukDua;
	}

	public double getDiskon() {
		return diskon;
	}

	public int getJumlahProdukSatu() {
		return jumlahProdukSatu;
	}

	public void setJumlahProdukSatu(int jumlahProdukSatu) {
		this.jumlahProdukSatu = jumlahProdukSatu;
	}

	public int getJumlahProdukDua() {
		return jumlahProdukDua;
	}

	public void setJumlahProdukDua(int jumlahProdukDua) {
		this.jumlahProdukDua = jumlahProdukDua;
	}

	public int getTotalBelanja() {
		return totalBelanja;
	}

	public void setTotalBelanja(int totalBelanja) {
		this.totalBelanja = totalBelanja;
	}

	public double getTotalDiskon() {
		return totalDiskon;
	}

	public void setTotalDiskon(double totalDiskon) {
		this.totalDiskon = totalDiskon;
	}
}
