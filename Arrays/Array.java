package Arrays;

public class Array {

	int[] arr;
	int count;

	public Array(int length) {

		arr = new int[length];
	}

	public void insert(int item) {
		// we need to grow the array if array if full
		if (count == arr.length) {
			int[] newArr = new int[count * 2];

			for (int i = 0; i < arr.length; i++)
				newArr[i] = arr[i];
			arr = newArr;
		}
		// we need add the new element at the end
		arr[count++] = item;

	}

	public void removeItemAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();

		for (int i = index; i < count; i++) {
			if (i < count - 1) {
				arr[i] = arr[i + 1];
			}

		}
		count--;
		//Adding empty comment
	}

	public int indexOf(int item) {

		for (int i = 0; i < count; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}

}
