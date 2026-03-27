public class Samochod {
	public String marka;
	public String model;
	public int rokProdukcji;
	
	public Samochod(String marka, String model, int rokProdukcji) {
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
	}
	
	public void wyswietlInfo() {
		System.out.println("Marka: " + this.marka + ", Model: " + this.model + ", Rok Produkcji: " + this.rokProdukcji);
	}
	
}
