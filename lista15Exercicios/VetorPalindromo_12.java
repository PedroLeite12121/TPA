import java.util.Scanner;
public class VetorPalindromo_12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, tam = 10, diminuidor = 1, subtracao, check = 0;
		int a[] = new int[tam];
		subtracao = tam - diminuidor;
		
		
		for(i = 0; i < tam; i++) {
			System.out.println("Digite o valor da posi��o " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();			
		}
		
		for(i = 0; i < subtracao; i++) {
			if(a[i] != a[tam - diminuidor]) {
				System.out.print("O vetor A, cujo os elementos s�o: [ ");
				for(i = 0; i < tam; i++) {
					System.out.print(a[i] + " ");		
				}
				System.out.println("] n�o � um pal�ndromo");
				
				check = 1;
				i = subtracao;
			}
			else {
				diminuidor++;
			}
		}
		
		if(check == 0) {
			System.out.print("O vetor A, cujo os elementos s�o: [ ");
			for(i = 0; i < tam; i++) {
				System.out.print(a[i] + " ");		
			}
			System.out.println("], � um pal�ndromo");
		}
	}
}