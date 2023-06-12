package BegginercodingaheetSiddhart;

public class sumandaverageofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {1,4,5,7,9,10,1};
      int sum=0;
      for(int i=0;i<=a.length-1;i++) {
    	  sum=sum+a[i];
      }
      float s=sum/a.length;
      System.out.println(sum);
      System.out.println(s);
      
	}

}
