import java.util.Scanner;
public class Fatorial {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int  fBase, f;
			
			System.out.println("Digite um número para ver seu fatorial");
			fBase = ler.nextInt();
			
			f = 1;
			
			while(fBase > 1) {
				f = f * fBase;
				fBase = fBase - 1;
			}
			System.out.println(f);
			ler.close();
	
		}
}
