package testng;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class reomvedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Geeksforgeeks";
		String d[] = s.split("");
		List<String> k = Arrays.asList(d);
	  // System.out.println(k.toString());
	   HashSet<String> n=new HashSet<String>(k);
	  // System.out.println(n);
	   for(String di:n) {
		   System.out.print(di);
	   }
		

	}

}
