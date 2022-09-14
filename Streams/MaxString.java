import java.util.List;
import java.util.Arrays;

//prints lexicographically highest string

public class MaxString
{
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("vamsi","akhil","rakesh");
		String res=list.stream().max(String::compareTo).get();
		System.out.println(res);
    //vamsi
		
	}
}
