import java.util.Scanner;
public class Intervalo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int intervaloInicial, intervaloFinal, intervaloFinalOriginal;
		float media, soma;
	
		
		System.out.println("Digite o intervalo inicial");
		
		intervaloInicial = ler.nextInt();
		
		
		System.out.println("Digite o intervalo final");
		
		intervaloFinal = ler.nextInt();
		intervaloFinalOriginal = intervaloFinal;
		
		
		soma = 0;
		
		while(intervaloInicial <= intervaloFinal) {
				
			soma = intervaloFinal + soma;
				
			intervaloFinal--;
		}
			
		media = soma / ((intervaloFinalOriginal - intervaloInicial) + 1);
		System.out.println(media);
	}

}
