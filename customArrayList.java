package customarraylistProgram;

import java.util.Arrays;

public class customArrayList {
	private int[] Array;
	private int InitialCapacity = 10;
	private int size = 0;

	public customArrayList() {
		this.Array = new int[InitialCapacity];
	}

	public customArrayList(int Givensize) {
		this.InitialCapacity = Givensize;
		this.Array = new int[InitialCapacity];
	}

	public void add(int value) {
		if (isFull()) {
			resize();
		}
		Array[size++] = value;
	}

	public Boolean isFull() {
		return size == Array.length;
	}

	public Boolean isEmpty() {
		return size == 0;
	}

	public void resize() {
		int[] temp = new int[InitialCapacity * 2];
		for (int index = 0; index < size; index++) {
			temp[index] = Array[index];
		}
		Array = temp;
	}

	public int remove(int value) {
		int removed = 0, removedIndex = 0, temp;
		for (int ArrayIndex = 0; ArrayIndex < size; ArrayIndex++) {
			if (Array[ArrayIndex] == value) {
				removed = Array[ArrayIndex];
				removedIndex = ArrayIndex;
			}
		}
		for (int i = removedIndex; i < size - 1; i++) {
			temp = Array[i];
			Array[i] = Array[i + 1];
			Array[i + 1] = temp;
			if (i == (size - 1)) {
				Arrays.fill(Array, size, Array.length, 0);
			}
		}
		size -= 1;
		return removed;
	}

	@Override
	public String toString() {
		if (size == 0)
			return "[]";
		return "[" + Arrays.toString(Array) + "]" + "size = " + size;
	}

}
