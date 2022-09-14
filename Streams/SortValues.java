import java.util.List;
import java.util.Arrays;
import java.util.Collections; 
public class SortValues
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,98,32,15);
		//ascending order
		list.stream().sorted().forEach(System.out::println);
		//descending order
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		
	}
}
