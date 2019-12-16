import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Diretor> diretores = new ArrayList<Diretor>();
		
		//instancia classe q vai receber lista
		Diretor diretor = new Diretor();
		
		//adc dado entrada
		diretor.setNome("Priscila");
		
		Filme harryPotter = new Filme();

		//adiciona dado a lista diretores
		diretores.add(diretor);
		
		System.out.println("Insira o nome do diretor:");
		String nameSurname = scanner.nextLine();
		System.out.println(nameSurname);
	}

}
