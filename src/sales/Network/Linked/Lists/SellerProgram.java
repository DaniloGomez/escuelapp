package sales.Network.Linked.Lists;

public class SellerProgram {

	public static void main(String[] args) {
		
		NetworkList networkList = new NetworkList();
		
		SalesNetwork n1 = new SalesNetwork();
		n1.membershipInitialFee = 1000;
		n1.membershipDiscountPercentaje = 10;
		n1.commissionProfitPercentaje = 25;
		
		Seller s1 = new Seller();
		Seller s2 = new Seller();
		Seller s3 = new Seller();
		
		
		n1.addSeller(s1);
		n1.addSeller(s2);
		n1.addSeller(s3);
		
		networkList.insertNetwork(n1);

		float balance = n1.balance(s1);
		System.out.println(balance);

	}

}
