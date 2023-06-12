package RahulShetty;

public class rahuls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String h="";
		String g = "1abc24";
		for (int i = 0; i <= g.length() - 1; i++) {
			if (Character.isDigit(g.charAt(i))) {
				for (int j = i; j <= g.length() - 1; j++) {
                if(Character.isDigit(g.charAt(j))) {
                	h=h+g.charAt(j);
                }
                else {
       
                	int p=Integer.parseInt(h);
                	System.out.println(p);
                	h="";
                	break;
                }
					
					
					
					
                  }
					
					
				}
			}

		}

	

}

