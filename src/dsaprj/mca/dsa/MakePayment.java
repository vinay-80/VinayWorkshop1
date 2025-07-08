package dsaprj.mca.dsa;

public class MakePayment extends Payment {
	void pay() {
		System.out.println("cash");
	}

	public static void main(String[] args) {
		MakePayment p=new MakePayment();
		p.pay();
		p.printbill();
		

	}

}
