package LikedLists;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PracticeLL {

	Node first;
	Node last;
	int size;

	class Node {

		Node next;
		int value;

		Node(int value) {
			this.value = value;

		}

		Node() {

		}

	}

	public void addLast(int item) {

		Node node = new Node(item);
		if (first == null) {
			first = last = node;
		}

		last.next = node;
		last = node;
		size++;

	}

	public void addFirst(int item) {
		Node node = new Node(item);

		if (first == null)
			first = last = node;
		node.next = first;
		first = node;

		size++;

	}

	public void removeLast() {

		if (first == null) {
			throw new NoSuchElementException();
		}

		if (first == last)
			first = last = null;
		else {
			Node pre = previousNode(last);
			last = pre;
			last.next = null;
		}
		size--;

	}

	public void removeFirst() {

		if (first == null)
			throw new NoSuchElementException();
		if (first == last)
			first = last = null;

		Node second = first.next;
		first = null;
		first = second;
		size--;

	}

	public int size() {
		return size;
	}

	public int indexOf(int item) {

		Node current = first;
		int index = 0;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			index++;
			current = current.next;
		}

		return -1;
	}

	public int[] getList() {
		int[] arr = new int[size];
		Node current = first;
		int index = 0;
		while (current != null) {
			arr[index++] = current.value;
			current = current.next;
		}

		return arr;

	}

	public boolean contains(int item) {
		Node current = first;
		while (current != null) {

			if (current.value == item) {
				return true;
			}
			current = current.next;

		}

		return false;

	}

	public Node previousNode(Node node) {

		var current = first;
		while (current != null) {
			if (current.next == node) {
				return current;
			}
			current = current.next;
		}

		return null;
	}

	public static void main(String[] args) {

		PracticeLL list = new PracticeLL();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(5);
		int[] arr = list.getList();

		System.out.println(Arrays.toString(arr));
		System.out.println(list.contains(30));

	}
}
