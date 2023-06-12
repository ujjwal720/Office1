
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a b=new a();
		b.oddeven(434);

	}

}

class a {

	public void oddeven(Integer k) {
		int sum = 0;
		int mul = 1;
		if (k % 2 == 0) {
			String z = k.toString();
			String[] j = z.split("");
			for (int i = 0; i <= j.length - 1; i++) {
				int l = Integer.parseInt(j[i]);
				sum = sum + l;
			}
			System.out.println(sum);
		} else {
			String z = k.toString();
			String[] j = z.split("");
			for (int i = 0; i <= j.length - 1; i++) {
				int l = Integer.parseInt(j[i]);
				mul = mul * l;
			}
			System.out.println(mul);
		}

	}

}
