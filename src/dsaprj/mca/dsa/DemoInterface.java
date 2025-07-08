package dsaprj.mca.dsa;

public class DemoInterface implements Game {

	public static void main(String[] args) {
		DemoInterface o=new DemoInterface();
		o.move();


	}
	public void move() {
		System.out.println("moving left");
	}

}
