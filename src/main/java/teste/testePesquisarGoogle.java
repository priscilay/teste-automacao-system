package teste;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import core.Diretor;
import core.Filme;
import pages.GoogleHomePage;
import pages.GooglePesquisaPage;

public class testePesquisarGoogle {
	
	List<Diretor> diretores = new ArrayList<Diretor>();
	GoogleHomePage googleHome = new GoogleHomePage();
	GooglePesquisaPage googlePesquisa = new GooglePesquisaPage();
	Scanner scanner = new Scanner(System.in);
	
	@Before()
	public void before() {
		System.out.println("Bem vindo ao Cadastro de Diretores e Filmes");
		System.out.println("Deseja cadastrar um diretor?");
		System.out.println("Escreva 's' para sim e 'n' para não");
		String opcao = "s";//scanner.nextLine();
		
		
		Diretor diretor = new Diretor();
		Filme filme = new Filme();
		
		do {
			System.out.println("Nome do diretor: ");
			String nomeDiretor = scanner.nextLine();
			diretor.setNome(nomeDiretor);
			
			System.out.println("Data de nascimento: ");
			String dn = scanner.nextLine();
			diretor.setNascimento(dn);
			
			List<Filme> filmes = new ArrayList<Filme>();
			do {
				System.out.println("Nome do filme: ");
				String filmeNome = scanner.nextLine();
				filme.setNome(filmeNome);
				
				System.out.println("Ano de lançamento: ");
				int filmeAno = scanner.nextInt();
				filme.setAno(filmeAno);
				
				filmes.add(filme);
				
				System.out.println("Deseja cadastrar um novo filme?");
				System.out.println("Escreva 's' para sim e 'n' para não");
				scanner.nextLine();
			}while(scanner.nextLine().contentEquals("s"));
			
			diretor.setFilmes(filmes);
			
			diretores.add(diretor);
			
			System.out.println("Deseja cadastrar um novo diretor?");
			System.out.println("Escreva 's' para sim e 'n' para não");
		}while(scanner.nextLine().contentEquals("s"));
	}
	
	@After
	public void fim() {
		killDriver();
	}
	
	@Test
	public void test() {
		for (Diretor diretor : diretores) {
			getDriver().get("https://www.google.com/");
			
			for (Filme filme : diretor.getFilmes()) {
				googleHome.setCampoPesquisa(diretor.getNome() + " " + filme.getNome());
				googleHome.pesquisar();
				String teste = googlePesquisa.getResultadoAproximadamente();
				System.out.println(teste);
			}
			
		}
	}

}
