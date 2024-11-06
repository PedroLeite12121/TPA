
import java.util.Scanner;

public class VetorIntersecao_9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, contadorB = 0, contadorC = 0;
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
		
		System.out.print("Os valores que aparecem tanto no vetor A e B são (Vetor C): [ ");
		for(i = 0; i<tam; i++) {
			for(contadorB = 0; contadorB<tam; contadorB++) {
				if(a[i] == b[contadorB]) {
					c[contadorC] = a[i];
					
					System.out.print(c[contadorC] + " ");

					
					contadorC++;
					contadorB = tam;
				}
			}
		}
		System.out.println("]");
		

		
	}
}