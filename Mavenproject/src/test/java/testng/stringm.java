package testng;

public class stringm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String y="Ujjwal987Sharma901";
         
          String d="";
          char[] v=y.toCharArray();
          for(int i=0;i<=v.length-1;i++) {
        	 boolean x=Character.isLetter(v[i]);
        	if(x=true) {
        		d=d+v[i];
        	}
        	else {
        		 StringBuilder t=new StringBuilder(d);
        		 System.out.print(t.reverse());
        		 d="";
        		 System.out.print(v[i]);
        		 
        	}
          }
          
	}

}
