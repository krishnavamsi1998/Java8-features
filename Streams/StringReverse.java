import java.util.stream.*;
public class StringReverse
{
	public static void main(String[] args) {
	  String str="vamsi";
		StringBuilder sb=new StringBuilder(str);
		
		String res=Stream.of(sb).map(x->x.reverse()).collect(Collectors.joining(""));
		
		System.out.println(res);
	
	}
}
