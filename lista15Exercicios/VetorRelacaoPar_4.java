import java.util.Scanner;

public class VetorRelacaoPar_4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, pares;
		int a[] = new int[tam];
		
		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			System.out.print(a[i] + ", todos os números pares que o antecedem são --> ");
			for(pares = 0; pares <= a[i]; pares = pares + 2) {
				System.out.print(pares + " ");
			}
			System.out.println();
		}
		
	}
}