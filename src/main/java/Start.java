import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;

import core.DSL;
import core.Diretor;
import core.Filme;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class Start{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Diretor> diretores = new ArrayList<Diretor>();
		Diretor diretor = new Diretor();
		Filme filme = new Filme();
		List<Filme> filmes = new ArrayList<Filme>();
		DSL dsl = new DSL();

		System.out.println("Bem vindo ao Cadastro de Diretores e Filmes");
		System.out.println("Deseja cadastrar um diretor?");
		System.out.println("Escreva 's' para sim e 'n' para não");
		String opcao = "s";//scanner.nextLine();
		
		if(opcao.contentEquals("s")) {
			diretor.setNome("teste");
			diretores.add(diretor);
			filme.setNome("teste");
			filmes.add(filme);
			/*
			System.out.println("Nome do diretor: ");
			String nomeDiretor = scanner.nextLine();
			diretor.setNome(nomeDiretor);
			diretores.add(diretor);
			
			System.out.println("Data de nascimento: ");
			String dn = scanner.nextLine();
			diretor.setNascimento(dn);
			diretores.add(diretor);
			System.out.println(diretores.size());
			
			System.out.println("Digite um filme desse diretor e ano de lançamento: ");
			String filmeNome = scanner.nextLine();
			filme.setNome(filmeNome);
			filmes.add(filme);
			
			int filmeAno = scanner.nextInt();
			filme.setAno(filmeAno);
			filmes.add(filme);
			
			*/
			for (Diretor dir : diretores) {
				getDriver().get("https://www.google.com/webhp?hl=pt-BR&sa=X&ved=0ahUKEwiEhJqX5LzmAhWFIbkGHYgNCpgQPAgH");
				 //dsl.escrever(By.xpath(".//input[@title='Pesquisar']"), "Diretor de filme " +dir.getNome() + "Data de nascimento " + dn + "Filme " + filmeNome + "Ano lançamento " + filmeAno);
			}
			
			
			
		} else {
			System.out.println("Fim do programa");
		}
		
		
		
		
		//instancia classe q vai receber lista
		//Diretor diretor = new Diretor();
		
		//adc dado entrada
//		diretor.setNome("Priscila");
//		
//		Filme harryPotter = new Filme();
//
//		//adiciona dado a lista diretores
//		diretores.add(diretor);
//		
//		System.out.println("Insira o nome do diretor:");
//		String nameSurname = scanner.nextLine();
//		System.out.println(nameSurname);
	}

}
