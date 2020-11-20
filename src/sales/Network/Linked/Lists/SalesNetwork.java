package sales.Network.Linked.Lists;

public class SalesNetwork {

	SellerList sellerList;
	
	float membershipDiscountPercentaje;
	float commissionProfitPercentaje;
	float membershipInitialFee;
	
	public SalesNetwork() {	
		sellerList = new SellerList();
	}
	
	void addSeller(Seller seller) {
		sellerList.insertSeller(seller);
	}
	
	public float balance(Seller seller) {
		float totalBalance = 0;
		float getDiscount = (membershipInitialFee * membershipDiscountPercentaje)/100;
			totalBalance = (membershipInitialFee - getDiscount);
			SellerNode tmp = sellerList.head.next;
			
			while(tmp.next !=null) {
				
				totalBalance = (balance(seller) * commissionProfitPercentaje)/100;
				
			}
		return totalBalance;
	}
	
}
