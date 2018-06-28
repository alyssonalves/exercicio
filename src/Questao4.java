import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Questao4 {

	private static final String email1 = "o fenômeno da Internet estimula a padronização das condições financeiras e administrativas exigidas. Por outro lado, a complexidade dos estudos efetuados faz parte de um processo de gerenciamento dos procedimentos normalmente adotados.";
	private static final String email2 = "o surgimento do comércio virtual estimula a padronização do sistema de participação geral. Por outro lado, o comprometimento entre as equipes causa impacto indireto na reavaliação dos procedimentos normalmente adotados.";
	private static final String email3 = "a determinação clara de objetivos estende o alcance e a importância das condições inegavelmente apropriadas. Nunca é demais lembrar o peso e o significado destes problemas, uma vez que a valorização de fatores subjetivos ainda não demonstrou convincentemente que vai participar na mudança das diversas correntes de pensamento.";
	private static final String email4 = " Acima de tudo, é fundamental ressaltar que a complexidade dos estudos efetuados apresenta tendências no sentido de aprovar a manutenção das condições inegavelmente apropriadas. O cuidado em identificar pontos críticos na execução dos pontos do programa faz parte de um processo de gerenciamento dos procedimentos normalmente adotados.";

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
