import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;


//find max element
public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(32,15,98,49,25,97,32);
		
		int max=list.stream().max(Integer::compare).get();
		
		
		System.out.println("Max ele is "+max);
	
	}
}
