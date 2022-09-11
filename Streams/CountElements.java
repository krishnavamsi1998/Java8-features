import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;


//count elements
public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(32,15,98,49,25,97,32);
		
		long count=list.stream().count();
		
		System.out.println("No of elements are "+count);
	  //No of elements are 7

	}
}
