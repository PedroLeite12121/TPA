import java.util.Scanner;
public class BaseExpoente {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int n = 1, nBase, e, i = 0;
			
			System.out.println("Digite um número");
			nBase = ler.nextInt();
			
			System.out.println("Digite um expoente para esse número");
			e = ler.nextInt();
			
			while(i < e) {
				n = nBase * n;
				i = i + 1;
				System.out.println(n);
			}
			ler.close();
}
}
