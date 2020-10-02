package sales.Network.Linked.Lists;

public class SellerList {

	SellerNode head;
	
	void insertSeller(Seller seller) {
		SellerNode newNode = new SellerNode();
		newNode.seller = seller;
		
		if(head == null){
			head = newNode;
		}
		
		else { //La lista no está vacía
			SellerNode last = head;
			while(last.next != null) {
				last = last.next;	
				}
			last.next = newNode;
			}
	}
	
}
