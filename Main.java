import MergeSort.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		//Задание 1. Реализовать алгоритм сортировки слиянием.
		MergeSort a = new MergeSort();
		List<Integer> b;
		b = a.getRand();

		MergeSort.mergeSort(b);
		for (int i = 0; i < b.size(); i++) System.out.println(b.get(i));
		System.out.println();

		// Задание 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
		List<Integer> showList = DeleteEvenNumbers.deleteEvenNumbers(b);
		for (int i = 0; i < b.size(); i++) System.out.println(showList.get(i));
		System.out.println();

		// Задание 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
		System.out.println("Минимальное значение:" + FindMinMaxAverage.findMin(b));
		System.out.println("Максимальное значение:" + FindMinMaxAverage.findMax(b));
		System.out.println("Среднее значение:" + FindMinMaxAverage.findAverage(b));
	}
}

