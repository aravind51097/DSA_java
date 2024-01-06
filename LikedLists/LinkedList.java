package LikedLists;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {
		private Node next;
		private int value;

		public Node(int value) {
			this.value = value;
		}

	}

	private Node first;
	private Node last;
	private int size;

	public void addLast(int item) {
		var node = new Node(item);
		if (isNodeEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;

		}
		size++;

	}

	public void addFirst(int item) {
		Node node = new Node(item);

		if (isNodeEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
		size++;
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;

		while (current != null) {

			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}

		return -1;
	}

	public boolean contains(int item) {
		/*
		 ** this is traditional method Node current = first; while(current !=null) {
		 * if(current.value==item) { return true; } current=current.next;
		 * 
		 * }
		 * 
		 * return false;
		 * 
		 * Since we have implemented InexOf we can use that method
		 * 
		 */
		//returning false if idexOfitem not found
		return indexOf(item) != -1;

	}

	public void removeFirst() {

		if (first == null) {
			throw new NoSuchElementException();
		}

		if (first == last) {
			first = last = null;
		}
		else {
			Node second = first.next;
			first = null;
			first = second;
			
		}
		size--;

	}

	public void removeLast() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		if (first == last) {
			first = last = null;
		}

		else {
			var previousNodeInLL = previousNode(last);
			last = previousNodeInLL;
			last.next = null;
		}
		size--;

	}

	public int size() {
	/*	int size = 1;

		if (first == null) {
			return 0;
		}

		Node current = first;
		while (current.next != null) {
			size++;
			current = current.next;
		} 
		
		/traversing throw list to find size will be O(n) not an efficient
		 way so we need to increment and decrement the size while adding 
		 and removing the elements
		*/

		return size;
	}
	public void reverse() {
		
		Node current =last;
		Node first=current;
		
		
		while(previousNode(current)!=null) {
			
			current=previousNode(current);
			last=current;
			
			
		}
		
		
	}
	
	
	
	public int[] toArray() {
		
		int[] array=new int[size];
		Node current =first;
		int index=0;
		while(current!=null) {
			
//			array[index]=current.value;
//			index++;
			array[index++]=current.value;
			current =current.next;
		}
		
		return array;
		
	}

	private Node previousNode(Node node) {
		Node current = first;
		while (current != null) {
			if (current.next == node) {
				return current;
			}
			current = current.next;

		}
		return null;
	}

	private boolean isNodeEmpty() {
		return first == null;
	}

}
