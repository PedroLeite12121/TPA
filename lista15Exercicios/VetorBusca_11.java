import java.util.Scanner;

public class VetorBusca_11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		

		int i, tam = 10, pesquisa;
		int a[] = new int[tam];

		//leitura do vetor A
		for(i = 0; i<tam; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
			a[i] = ler.nextInt();
		}
		System.out.print("Digite qual elemento você deseja pesquisar, dentro do vetor A: ");
		pesquisa = ler.nextInt();
		
		for(i = 0; i<tam; i++) {
			//quando o contador i chegar no seu ultimo loop e o resultado desta pesquisa for falso, mensagem de erro
			if(pesquisa != a[i] && i == tam - 1) {
				System.out.println("O elemento " + pesquisa + " não existe no vetor A");
			}
			
			if(pesquisa == a[i]) {
				System.out.println("O elemento " + pesquisa + " existe no vetor A");
				//automaticamente quebra o loop for
				i = tam;
			}
		}
	}
}