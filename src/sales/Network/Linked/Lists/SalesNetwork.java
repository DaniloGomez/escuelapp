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
	
}
