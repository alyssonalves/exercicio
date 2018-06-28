import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Questao4 {

	private static final String email1 = "o fen�meno da Internet estimula a padroniza��o das condi��es financeiras e administrativas exigidas. Por outro lado, a complexidade dos estudos efetuados faz parte de um processo de gerenciamento dos procedimentos normalmente adotados.";
	private static final String email2 = "o surgimento do com�rcio virtual estimula a padroniza��o do sistema de participa��o geral. Por outro lado, o comprometimento entre as equipes causa impacto indireto na reavalia��o dos procedimentos normalmente adotados.";
	private static final String email3 = "a determina��o clara de objetivos estende o alcance e a import�ncia das condi��es inegavelmente apropriadas. Nunca � demais lembrar o peso e o significado destes problemas, uma vez que a valoriza��o de fatores subjetivos ainda n�o demonstrou convincentemente que vai participar na mudan�a das diversas correntes de pensamento.";
	private static final String email4 = " Acima de tudo, � fundamental ressaltar que a complexidade dos estudos efetuados apresenta tend�ncias no sentido de aprovar a manuten��o das condi��es inegavelmente apropriadas. O cuidado em identificar pontos cr�ticos na execu��o dos pontos do programa faz parte de um processo de gerenciamento dos procedimentos normalmente adotados.";

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		for(int i = 0; i < 10; i++) {
			int aleatorio = new Random().nextInt(4);

			switch (aleatorio) {
			case 1:
				lista.add(email1);
				break;
			case 2:
				lista.add(email2);
				break;
			case 3:
				lista.add(email3);
				break;
			case 4:
				lista.add(email4);
				break;

			default:
				break;
			}
		}
		removeDuplicatas(lista);
	}

	private static List<String> removeDuplicatas(List<String> lista) {

		ArrayList<String> result = new ArrayList<>();

		HashSet<String> set = new HashSet<>();

		for (String item : lista) {

			if (!set.contains(item)) {
				result.add(item);
				set.add(item);
			}
		}
		return result;

	}

}
