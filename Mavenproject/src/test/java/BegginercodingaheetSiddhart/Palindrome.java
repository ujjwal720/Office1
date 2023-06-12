package BegginercodingaheetSiddhart;

public class Palindrome {

	public static void main(String[] args) {
		
		
		int n=121;
		System.out.println(n);
		String s=Integer.toString(n);
		StringBuffer r=new StringBuffer(s);
		String h=r.reverse().toString();
		if(s.equals(h)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
		

	}

}
