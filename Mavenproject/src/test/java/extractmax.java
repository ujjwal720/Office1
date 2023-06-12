import java.util.ArrayList;
import java.util.List;

public class extractmax {

	public static void main(String[] args) throws NumberFormatException{
		// TODO Auto-generated method stub

		String s = "123abc126abc8";
		String x = "0";
		List<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isDigit(s.charAt(i))) {
				    x=x+s.charAt(i);
			} 
			else {
				int z = Integer.parseInt(x);
				y.add(z);
				x="";
			}
		}
	
		

	}

}
