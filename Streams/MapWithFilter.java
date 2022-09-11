
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

// print numbers that starts with 1
public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		
	
	   list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	
		
	}
}
