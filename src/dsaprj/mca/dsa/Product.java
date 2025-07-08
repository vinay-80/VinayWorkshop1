package dsaprj.mca.dsa;

import java.util.Objects;

public class Product {
	String prdName;
	int prdID;
	double prdPrice;
	public Product(String prdName, int prdID, double prdPrice) {
		super();
		this.prdName = prdName;
		this.prdID = prdID;
		this.prdPrice = prdPrice;
		
	}
	public Product(String prdName2, int prdID2, int prdPrice2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prdName=" + prdName + ", prdID=" + prdID + ", prdPrice=" + prdPrice + "]";
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(prdID, prdName, prdPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return prdID == other.prdID && Objects.equals(prdName, other.prdName)
				&& Double.doubleToLongBits(prdPrice) == Double.doubleToLongBits(other.prdPrice);
	}

}
