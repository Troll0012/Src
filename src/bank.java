public class kontobankowe {
	private double saldo;
	
	public void wplac(double kwota){
		if(kwota > 0){
			saldo += kwota;
		}
	}

	public void wyplac(double kwota){
		if(kwota > 0 && kwota <= saldo){
			saldo -= kwota;
		}
	}
	public double getsaldo(){
		return saldo;
	}
}
