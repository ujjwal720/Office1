package RahulShetty;

import java.util.ArrayList;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] m= {1,2,3,4,5};
		ArrayList<Integer> f=new ArrayList<Integer>();
		f.add(m[m.length-1]);
	
		for(int i=0;i<=m.length-1;i++) {
			if(i==m.length-1) {
				break;
			}
			f.add(m[i]);
			
			
			
		}
		System.out.println(f);

	}

}
