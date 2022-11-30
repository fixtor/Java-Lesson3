import java.util.ArrayList;
import java.util.List;

public class FindMinMaxAverage {

	public static Integer findMin(List <Integer> list){
		int a = 0;
		for(int i = 0; i < list.size()-1; i++) {
			a = list.get(0);
			if (a > list.get(i)) a = list.get(i);
		}
		return a;
	}

	public static Integer findMax(List <Integer> list){
		int a = 0;
		for(int i = 0; i < list.size(); i++) {
			a = list.get(0);
			if (a <= list.get(i)) a = list.get(i);
		}
		return a;
	}
	public static double findAverage(List <Integer> list){
		List<Integer> temp = new ArrayList<>();
		double a = 0;
		for(int i = 0; i < list.size(); i++) {
			a += list.get(i);
		}
		a /= list.size();
		return a;
	}
}
