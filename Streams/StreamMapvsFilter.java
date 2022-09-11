
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;



public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		
	
	// list=list.stream().filter(x->x%2==0).collect(Collectors.toList());
	
	// [10, 8, 98, 32]

	    
	 list=list.stream().map(x->x+1).collect(Collectors.toList());
		
		
	 System.out.println(list);
	
	 //[11, 16, 9, 50, 26, 99, 33]
	
		
	}
}
