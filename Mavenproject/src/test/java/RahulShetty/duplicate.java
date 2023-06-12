package RahulShetty;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 1, 2, 1, 1, 1, 3, 2, 4, 1, 2, 5 };
		int s = a.length - 1;
		int count =0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] != -1) {
				for (int j = i + 1; j <= a.length - 1; j++) {
		          
					if (a[i] == a[j]) {
						count++;
						a[j] = -1;
						
					}
					
					
                   
				}
				if(count>0) {
					System.out.println(a[i]);
				}
				count =0;
				
			}
		}
		
		

	}

}
