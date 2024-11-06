import java.util.Scanner;

public class VetorPrimo_3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, divisor = 1, primoContador = 0;
		int a[] = new int[tam];
		
		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		System.out.print("Os valores do vetor A são: [ ");
		for(i = 0; i<tam; i++) {
			//apresenta os valores do vetor
			System.out.print(a[i] + " ");
			
			//divide um valor do vetor a por uma variavel que aumenta até se igualar ao valor do vetor
			for(divisor = 1; divisor <= a[i]; divisor++) {
				//caso o resto da divisao for 0 (divisao exata), o numero de divisores aumenta por um
				if(a[i] % divisor == 0) {
					primoContador++;
				}
			}

			//caso o numero de divisores seja igual a 2, primo
			if(primoContador == 2) {
				System.out.print("<-- Primo ");
			}
			
			//reinicia o valor do numero de divisores para cada posição do vetor
			primoContador = 0;
			
		}
			
		System.out.println("]");
	}
}