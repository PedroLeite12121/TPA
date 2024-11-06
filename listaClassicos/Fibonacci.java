import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int n,i,anterior, atual, proximo; 
	
	anterior = 0;
	atual = 1;
	proximo = atual + anterior;
	
	i = 1;
	
	System.out.println("Digite o número de vezes que será repetida a sequência de Fibonacci");
	
	n = ler.nextInt();
	 
	while(i <= n) {
		proximo = atual + anterior;
		anterior = atual;
		atual = proximo;
		
		System.out.println(atual);
		i = i + 1;
	}
	}
	
	
	
}
