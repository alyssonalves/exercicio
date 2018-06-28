
public class Questao2 {
	
	public static void main(String[] args) {
		
		System.out.println(permutacao("you", "yuo"));
		System.out.println(permutacao("probably", "porbalby"));
		System.out.println(permutacao("despite", "desptie"));
		System.out.println(permutacao("moon","nmoo"));
		System.out.println(permutacao("misspellings", "mpeissngslli"));
		
	}
	
	private static boolean permutacao(String palavra1, String palavra2) {
		
		double tamanhoPalavra1 = palavra1.length();
		double tamanhoPalavra2 = palavra2.length();
		double quatidadeMudanca  = 0;
		
		if(palavra1.substring(0, 1).equals(palavra2.substring(0, 1))) {
			
			if(tamanhoPalavra1 >= 3 && tamanhoPalavra2 >= 3) {
				
				for(int i = 0; i < tamanhoPalavra1; i++) {
					if(!palavra1.substring(i, i+1).equals(palavra2.substring(i, i+1))) {
						quatidadeMudanca++;
					}
				}
				if((quatidadeMudanca/tamanhoPalavra1) <= 0.67) {
					return true;
				}
			}
		}
		return false;
	}
}
