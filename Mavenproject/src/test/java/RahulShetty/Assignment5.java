package RahulShetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0, 19);
		a.add(1, 2);
		a.add(2, 3);
		a.add(3, 19);
		a.add(4, 20);
		System.out.println(a);
		System.out.println(a.get(2));
		Collections.sort(a);
		System.out.println(a);
	   a.size();
	   for(int b:a) {
		   System.out.println(b);
	   }
	   Integer[] g= {1,2,3,4,5,6,7};
	   
	   List<Integer> m=Arrays.asList(g);//we can covert by using the following method
	   /////
	   
	  
	}

}
