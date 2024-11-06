import java.util.Scanner;

public class VetorTabuada_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 5, mult = 0;
		int a[] = new int[tam];
		
		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		

		for(i = 0; i<tam; i++) {
			for (mult = 0; mult <= 10; mult++) {
				System.out.println(a[i] + " x " + mult + " = " + a[i] * mult);
			}
		}
	}
}