package While;
public class Somatoria {
	public static void main(String[] args) {
			int i, soma;
			i = 1;
			soma = 0;
			
			while (i <= 100) {
				soma = soma + i;
				i = i + 1;
			}
			System.out.println(soma);
	}

}
