import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNonRepeatChar
{
	public static void main(String[] args) {
	    
	    String s="vikram krishna vamsi";
	    
	    Map<Character,Integer> map=new LinkedHashMap<>();
	    
	   for(int i=0;i<s.length();i++)
	   {
	    char c=s.charAt(i);
	    //igonore white space
	    if(c!=' ')
	    map.put(c,map.getOrDefault(c,0)+1);
	   }
	   // first non repeat character
	   char res=map.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
	   //h
	   //first repeat character
	   char res=map.entrySet().stream().filter(x->x.getValue()>1).findFirst().get().getKey();
	   //v
	    
	   System.out.println(res);
  
	    
	    
		
	}
}
