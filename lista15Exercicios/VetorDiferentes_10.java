
import java.util.Scanner;

public class VetorDiferentes_10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, contadorB = 0, contadorC = 0, iguais = 0;
		int a[] = new int[tam];
		int b[] = new int[tam];
		int c[] = new int[tam];

		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		//leitura do vetor B
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor B");
			b[i] = ler.nextInt();
		}
		
		//calculos
		
		
		System.out.print("Os valores que aparecem somente no vetor A são (Vetor C): [ ");
		for(i = 0; i<tam; i++) {
			iguais = 0;
			for(contadorB = 0; contadorB<tam; contadorB++) {
				if(a[i] != b[contadorB] && contadorB == tam - 1 && iguais != 1) {
					c[contadorC] = a[i];
					
					System.out.print(c[contadorC] + " ");
					
					contadorC++;
				}
				if(a[i] == b[contadorB]) {
					iguais = 1;
				}
			}
		}
			
			
		System.out.println("]");
	}
}