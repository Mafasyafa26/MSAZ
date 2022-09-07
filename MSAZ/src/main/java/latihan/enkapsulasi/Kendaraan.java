package latihan.enkapsulasi;

public class Kendaraan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mobil = new Car("Pertalite");
		mobil.warna();
		mobil.mesin();
		System.out.println("bahannya : " + mobil.getBahanBakar());
		System.out.println("tahunn pembuatan : " + mobil.getTahunPembuatan());
	}

}
