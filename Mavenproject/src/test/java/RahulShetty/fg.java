package RahulShetty;

public class fg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		String h = "";
		int count = 0;
		String g = "1a45bc24";
		for (int i = 0; i <= g.length() - 1; i++) {
			if (i == g.length() - 1) {
				break;
			}

			if (Character.isDigit(g.charAt(i))) {
				for (int j = i; j <= g.length() - 1; j++) {
					if (Character.isDigit(g.charAt(j))) {
						h = h + g.charAt(j);
						if (j == g.length() - 1) {
							int p = Integer.parseInt(h);
							//System.out.println(p);
							h = "";
							count = j;
							sum = sum + p;
							System.out.println(sum);
							break;
						}

					} else {

						int p = Integer.parseInt(h);
						// System.out.println(p);
						h = "";
						count = j;
						sum = sum + p;
						break;

					}

				}

			}

		}

	}

}
