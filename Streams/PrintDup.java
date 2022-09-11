import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//print out duplicate numbers in integers List
public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(32,15,98,49,25,98,32);
		Set<Integer> set=new HashSet<>();
		
	
	   list=list.stream().filter(n->!set.add(n)).collect(Collectors.toList());
	   System.out.print(list);
	   
	   // [98,32]
		
	}
}
