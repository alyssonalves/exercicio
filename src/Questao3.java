
public class Questao3 {

	public static void main(String[] args) {

		System.out.println(erroDigitacao("pale", "ple"));
		System.out.println(erroDigitacao("pales", "pale"));
		System.out.println(erroDigitacao("pale", "bale"));
		System.out.println(erroDigitacao("pale", "bake"));

	}

	private static boolean erroDigitacao(String palavra1, String palavra2) {

		int tamanhoPalavra1 = palavra1.length();
		int tamanhoPalavra2 = palavra2.length();
		int quatidadeDiferencas = 0;
		
		char[] texto1 = palavra1.toCharArray();
		char[] texto2 = palavra2.toCharArray();
		
		char[] texto3 = new char[tamanhoPalavra1];
		
		
		for(int i = 0; i < tamanhoPalavra1; i++) {
			
			for(int j = 0; j < tamanhoPalavra2; j++) {
				
				if(texto1[i] == texto2[j]) {
					
					texto3[i] = texto2[j];
					
					break;
				}
			}
			
		}
		
		for(int i = 0; i < tamanhoPalavra1; i++) {
			if(texto1[i] == texto3[i]) {
				continue;
			}else {
				quatidadeDiferencas++;
			}
		}
		
		if(quatidadeDiferencas > 1) {
			return false;
		}

		return true;
	}

}
