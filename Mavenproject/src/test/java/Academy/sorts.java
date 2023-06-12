package Academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> u=new ArrayList<Integer>();
		int[] a= {9,2,0,9};
		for(int i=0;i<=a.length-1;i++) {
			
			u.add(a[i]);
			
		}
		
		Collections.sort(u);
		
		System.out.println(u);

	}

}
