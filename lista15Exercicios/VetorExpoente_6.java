public class VetorExpoente_6 {
	public static void main(String[] args) {
		

		int i, tam = 11, mult = 1;
		int a[] = new int[tam];
		a[0] = 1;
		
		//usaria o método "pow" mas não me recordo dele ter sido ensinado durante as aulas
		for(i = 1; i < tam; i++) {
			a[i] = a[i - 1] * 2;
		}
	
		
		for(i = 0; i<tam; i++) {
			System.out.print(a[i] + " ");
		}


		
	}
}