package Arrays;


public class SayHello {
	public static void main(String[] args) {
		
	
		Array nums=new Array(2);
		nums.insert(10);
		nums.insert(20);
		nums.insert(30);
		nums.insert(40);
		nums.removeItemAt(2);
		System.out.println("index "+nums.indexOf(40));
		nums.print();

		
		
	}
	
}
