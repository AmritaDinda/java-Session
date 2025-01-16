package javasession;

public class Order {
	
	public int getOrder(String customerName, int price, int tax) {
		
		//buss logic
		System.out.println(customerName);
		int k = price +tax;
		return k;
	}
	
	
	public int getOrder(String customerName, int price) {
		
		//buss logic
		System.out.println(customerName);
		int k = price ;
		return k;
	}
	
	
	

	public static void main(String[] args) {
		
		Order obj = new Order();
		int h = obj.getOrder("nisu",10,5);
		System.out.println(h);
		
		obj.getOrder("avi",1000);
		
		
		
		
		
		
	}

}
