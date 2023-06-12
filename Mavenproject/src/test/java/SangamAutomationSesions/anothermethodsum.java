package SangamAutomationSesions;

public class anothermethodsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1234;

		String s = Integer.toString(a);
		
		int sum=0;
		
		for(int i=0;i<=s.length()-1;i++) {
			int b=Integer.parseInt(Character.toString(s.charAt(i)));
			sum=sum+b;
		}
		
		System.out.println(sum);
	

	}

}
