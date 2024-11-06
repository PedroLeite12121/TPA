import java.util.Scanner;

public class VetorRelacaoDivisores_5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, divisores;
		int a[] = new int[tam];
		
		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i<tam; i++) {
			System.out.print(a[i] + ", seus divisores são --> ");
			for(divisores = 1; divisores <= a[i]; divisores++) {
				if(a[i] % divisores == 0) {
					System.out.print(divisores + " ");
				}
			}
			System.out.println();
		}
		
	}
}