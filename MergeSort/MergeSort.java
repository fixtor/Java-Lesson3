package MergeSort;

import java.util.*;

public class MergeSort {
	//
	List<Integer> listOriginalBegins = new ArrayList<>();
	Integer sizeOfList = 10;
	Random rand = new Random();
    public MergeSort() {}


	public List<Integer> getRand() {
		for (int i = 0; i < sizeOfList; i++) listOriginalBegins.add(rand.nextInt());
		return listOriginalBegins;
	}

	public static void mergeSort(List<Integer> list) {
		List<Integer> listSupport = new ArrayList<>(list);
		int startIndex = 0;
		int stopIndex = listSupport.size() - 1;
		mergeSort(list, listSupport, startIndex, stopIndex);

	}

	public static void mergeSort(List<Integer> list, List<Integer> listSupport, int startIndex, int endIndex) {
		if (startIndex >= endIndex) return;

		int h = startIndex + (endIndex - startIndex) / 2;
		mergeSort(list, listSupport, startIndex, h);
		mergeSort(list, listSupport, h + 1, endIndex);
		merge(list, listSupport, startIndex, h, h + 1, endIndex);
	}

	public static void merge(List<Integer> list, List<Integer> listSupport, int leftS, int leftE, int rightS, int rightE) {
		for (int i = leftS; i <= rightE; i++) listSupport.set(i, list.get(i));
		int left = leftS;
		int right = rightS;
		for (int i = leftS; i <= rightE; i++) {
			if (left > leftE) {
				list.set(i, listSupport.get(right));
				right += 1;
			} else if (right > rightE) {
				list.set(i, listSupport.get(left));
				left += 1;
			} else if (listSupport.get(left) < listSupport.get(right)) {
				list.set(i, listSupport.get(left));
				left += 1;
			} else {
				list.set(i, listSupport.get(right));
				right += 1;
			}
		}
	}
}