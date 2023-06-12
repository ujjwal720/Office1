package BegginercodingaheetSiddhart;

public class Capitilizefirstletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "india is a place to learn and grow";
		String[] h = s.split(" ");
		for(int i=0;i<=s.length()-1;i++) {
	      char[] d=h[i].toCharArray();
	       Character.toUpperCase(d[0]);
	       System.out.println(d[0]);
		}

	}

}
