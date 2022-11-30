import java.util.List;

public class DeleteEvenNumbers {

	public static List<Integer> deleteEvenNumbers(List<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2 == 0){
				list.remove(i); i--;
			}
		}
		return list;
	}
}
