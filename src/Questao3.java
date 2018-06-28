
public class Questao3 {

	public static void main(String[] args) {

		System.out.println(erroDigitacao("pale", "ple"));

	}

	private static boolean erroDigitacao(String palavra1, String palavra2) {

		int tamanhoPalavra1 = palavra1.length();
		int tamanhoPalavra2 = palavra2.length();
		int quatidadeMudanca  = 0;
		int diferencaTamanho = 0;
		
		char[] texto1 = palavra1.toCharArray();
		char[] texto2 = palavra2.toCharArray();
		
		for(char a : texto1) {
			
			for(char b : texto2) {
				
			}
		}
		
		
		if(tamanhoPalavra1 > tamanhoPalavra2) {
			diferencaTamanho = tamanhoPalavra1 - tamanhoPalavra2;
		}else {
			diferencaTamanho = tamanhoPalavra2 - tamanhoPalavra1;
		}

		for(int i = 0; i < palavra1.length(); i++) {
			if(!palavra1.substring(i, i+1).equals(palavra2.substring(i, i+1))) {
				quatidadeMudanca++;
			}
		}

		if(quatidadeMudanca > 1) {
			return false;
		}

		return true;
	}

}
