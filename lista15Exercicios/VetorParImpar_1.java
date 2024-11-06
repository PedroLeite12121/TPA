
import java.util.Scanner;

public class VetorParImpar_1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 20, subtracao = 1, soma = 0;
		int a[] = new int[tam];
		int b[] = new int[tam];
		
		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		
		//calculos do vetor
		for(i = 0; i<tam; i++) {
			//se o primeiro valor do vetor A for par, a primeira posição do vetor B vai ser igual a ela
			if(a[i] % 2 == 0) {
				b[soma] = a[i];
				//ordem crescente (0,1,2,etc)
				soma++;
			}
			//caso for impar, o ultimo valor sera igual a ela
			else {
				b[tam - subtracao] = a[i];
				//ordem decrescente (5,4,3,etc)
				subtracao++;
				
			}
		}
		
		
		System.out.print("O vetor B possui os valores: [ ");
		for(i = 0; i<tam; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.print("]");

		
		
		
	}
}
