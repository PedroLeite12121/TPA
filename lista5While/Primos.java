import java.util.Scanner;
public class Primos {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int n, i = 1, numDivisores = 0;
			
			System.out.println("Digite um número");
			n = ler.nextInt();
			
			while(i <= n) {
				if(n % i == 0) {
					numDivisores = numDivisores + 1;
				}
				i = i + 1;
			}
			
			if(numDivisores == 2) {
				System.out.println("Número primo");
			}
			else {
				System.out.println("Número composto");
			}
			ler.close();
		}
}
