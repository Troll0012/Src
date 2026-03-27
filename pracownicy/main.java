public class main{
	public static void main(String[], args){
		Arraylist<> list = new Arraylist<>();
		programista programista = new programista();
		programista.imie = "Adam";
		programista.pensja = 8000;
		programista.jezykprogramowania = "Java";
		
		menedzer menedzer = new menedzer();
		menedzer.imie = "Mariusz";
		menedzer.pensja = 3500;
		menedzer.premia = 700;

		list.add(programista);
		list.add(menedzer);

		for(Pracownik pracownik : list){
			Sysytem.out.println(pracownik.imie + ":" + pracownik.pensja);
		}
	}
}
