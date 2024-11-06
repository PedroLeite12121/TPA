import java.util.Scanner;
public class VetorSomatoria_8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, tam = 10, soma = 0, j = 0;
		int a[] = new int[tam];
		int b[] = new int[tam];
		
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			for(j = i; j<tam; j++) {
				soma = soma + a[j];
			}
			b[i] = soma;
			soma = 0;
		}
		
		System.out.print("Os valores do vetor B são: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(b[i] + " ");	
		}
		System.out.print("]");
		

		
	}
}