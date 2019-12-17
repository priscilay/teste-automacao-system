package pages;


import core.DSL;

public class GooglePesquisaPage extends DSL{
	public String getResultadoAproximadamente() {
		return super.obterValorTexto("resultStats");
		
	}
}
