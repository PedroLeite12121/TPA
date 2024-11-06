public class Tabuada {
	public static void main(String[] args) {
		int i, n;
		i = 0;
		n = 1;
		while(n <= 10) {
			System.out.println(n + " x " + i + " = " + n * i);
			if (i == 10) {
				i = 0;
				n = n + 1;
				System.out.println();
			}
			i = i + 1;
		}
	}
}

