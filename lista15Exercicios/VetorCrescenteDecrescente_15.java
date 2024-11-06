import java.util.Scanner;

public class VetorCrescenteDecrescente_15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i=0, tam = 10, temp, j;
		int a[] = new int[tam];
		int b[] = new int[tam];
		int c[] = new int[tam];

		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i];
			c[i] = a[i];
		}
		


		
		for(i = 0; i<tam; i++) {
			for(j = 0; j<tam - 1; j++) {
				if(b[j+1] < b[j]) {
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		
		}
		
		for(i = 0; i<tam; i++) {
			for(j = 0; j<tam - 1; j++) {
				if(c[j+1] > c[j]) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		
		}
		
			
			
		//apresenta os vetores 
		System.out.print("Os valores do vetor B são: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("Os valores do vetor C são: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("]");
		
		
		
		
	}
}