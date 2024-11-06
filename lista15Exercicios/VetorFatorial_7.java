import java.util.Scanner;
public class VetorFatorial_7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, tam = 15, fatorial, fatorialValor = 1;
		int a[] = new int[tam];
		int b[] = new int[tam];
		
		
		for(i = 0; i < tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();			
		}
		
		for(i = 0; i < tam; i++) {
			for(fatorial = a[i]; fatorial > 0; fatorial--) {
				fatorialValor = fatorial * fatorialValor;
			}
			b[i] = fatorialValor;
			fatorialValor = 1;
		}
		
		System.out.print("Os valores do vetor B são: [ ");
		for(i = 0; i < tam; i++) {
			System.out.print(b[i] + " ");		
		}
		System.out.println("]");
		
	}
}