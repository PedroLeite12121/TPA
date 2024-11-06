
import java.util.Scanner;

public class VetorZeroImparUmPar_13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10;
		int a[] = new int[tam];
		int b[] = new int[tam];
		
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
		}
		
		System.out.print("Os valores do vetor B são: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		
	}
}