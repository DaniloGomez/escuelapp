package trees.binary.salesNetwork;

public class SalesNetworkProgram {

	public static void main(String[] args) {
		
		SalesNetworkTree salesNetworkTree = new SalesNetworkTree();
		salesNetworkTree.membershipInitialFee = 1000;
		salesNetworkTree.membershipDiscountPercentaje = 10;
		salesNetworkTree.commissionProfitPercentaje = 25;
		
		SellerNode m = new SellerNode();
		SellerNode l = new SellerNode();
		SellerNode r = new SellerNode();
		m.left = l;
		m.right = r;
		
		salesNetworkTree.root = m;
		
		float balance = salesNetworkTree.balance(l);
		System.out.println("Balance: " + balance);
		
		float totalBalance = salesNetworkTree.totalNetworkBalance(m);
		System.out.println("Total balance: " + totalBalance);

	}

}
