package pages;

import org.openqa.selenium.By;

import core.DSL;

public class GoogleHomePage extends DSL {
	
	public void setCampoPesquisa(String pesquisar) {
		super.escrever(By.name("q"), pesquisar);
	}
	
	public void pesquisar() {
		super.pesquisar(By.name("q"));
	}
}
