package trees.binary.salesNetwork;

public class SalesNetworkTree {
	
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	
	SellerNode root;
	
	public float balance(SellerNode node) {
		if(node == null) {
			return 0;		
		}
				
		float leftChildBalance = balance(node.left);
		leftChildBalance = leftChildBalance*(commissionProfitPercentaje/100);

		float rightChildBalance = balance(node.right);
		rightChildBalance = rightChildBalance*(commissionProfitPercentaje/100);
		
		return membershipInitialFee - (membershipInitialFee * membershipDiscountPercentaje/100) 
				+ leftChildBalance 
				+ rightChildBalance;
	}
	
	public float totalNetworkBalance(SellerNode root) {
		return balance(root) + balance(root.left) + balance(root.right);
	}
	
}
