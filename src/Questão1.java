
public class Questão1 {

	private static final String TEXTO = "Este é um desafio do CESAR";

	public static void main(String[] args) {

		int tamanhoArray = TEXTO.length();

		String[] texto = new String[tamanhoArray];

		for(int i = 0; i < tamanhoArray; i++) {
			texto[i] = TEXTO.substring(i, i+1);
			//texto[i] = TEXTO.substring(i, i+1) == " " ? "&32" : TEXTO.substring(i, i+1);
		}

		for(int i = 0; i < texto.length; i++) {
			texto[i] = texto[i].replace(" ", "&32");
		}
		
		for(String s : texto) {
			System.out.print(s);
		}
	}
}
