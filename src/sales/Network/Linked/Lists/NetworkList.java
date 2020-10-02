package sales.Network.Linked.Lists;

public class NetworkList {

	NetworkNode head;
	
	void insertNetwork(SalesNetwork network) {
		NetworkNode newNode = new NetworkNode();
		newNode.network = network;
		
		//La lista est� vac�a
				if(head == null){
					head = newNode;
				}
				else { //La lista no est� vac�a
					NetworkNode last = head;
					while(last.next != null) {
						last = last.next;		
					}
					last.next = newNode;
	}
	}
	
}
