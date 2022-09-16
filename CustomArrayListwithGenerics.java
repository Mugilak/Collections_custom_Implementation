package customarraylistProgram;

import java.util.Arrays;

public class CustomArrayListwithGenerics<M> {

	private Object[] Array;
	private int InitialCapacity = 10;
	private int size = 0;

	public CustomArrayListwithGenerics() {
		this.Array = new Object[InitialCapacity];
	}

	public CustomArrayListwithGenerics(int Givensize) {
		this.InitialCapacity = Givensize;
		this.Array = new Object[InitialCapacity];
	}

	public void add(M value) {
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
		Object[] temp = new Object[InitialCapacity * 2];
		for (int index = 0; index < size; index++) {
			temp[index] = Array[index];
		}
		Array = temp;
	}

	@SuppressWarnings("unchecked")
	public M remove(M value) {
		M removed = null, temp;
		int removedIndex = 0;
		for (int ArrayIndex = 0; ArrayIndex < size; ArrayIndex++) {
			if (Array[ArrayIndex] == value) {
				removed = (M) Array[ArrayIndex];
				removedIndex = ArrayIndex;
				break;
			}
		}
		for (int i = removedIndex; i < size - 1; i++) {
			temp = (M) Array[i];
			Array[i] = (M)Array[i + 1];
			Array[i + 1] = temp;
//			System.out.println(Array[i]+" "+Array[i+1]+" "+temp);
			if (i == (size - 2)) {
				Arrays.fill(Array, size-1, Array.length, null);
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
