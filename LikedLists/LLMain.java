package LikedLists;

import java.util.Arrays;

public class LLMain {
	public static void main(String[] args) {
		
		LinkedList nums =new LinkedList();
		
		nums.addLast(10);
		nums.addLast(20);
		nums.addLast(30);
		
		System.out.println(nums.size());
		
		int[] arrays=nums.toArray();
		
//		var arrays=nums.toArray();
		System.out.println(Arrays.toString(arrays));
		
		
		
		nums.reverse();
		int[] array=nums.toArray();
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Success");
		
	}

}
