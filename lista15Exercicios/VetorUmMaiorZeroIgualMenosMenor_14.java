import java.util.Scanner;

public class VetorUmMaiorZeroIgualMenosMenor_14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10;
		int a[] = new int[tam];
		int b[] = new int[tam];
		int c[] = new int[tam];
		
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor B");
			b[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			else if(a[i] == b[i]) {
				c[i] = 0;
			}
			else {
				c[i] = -1;
			}
			
		}
		
		System.out.print("Os valores do vetor C são: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(c[i] + " ");	
		}
		System.out.print("]");
		
	}
}