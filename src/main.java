public class main{
	public static void main(String[], args){
		bank bank = new bank;
		bank.wplac(3450);
		bank.wyplac(450);
		System.out.println("twoje saldo to: " + bank.getsaldo());
	}

}
