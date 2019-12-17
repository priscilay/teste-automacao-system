package core;
import java.util.List;

public class Diretor
{
    private String nome;
    private String nascimento;
    private List<Filme> filmes;
    
    public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public String getNome() {
		return nome;
	}
    
    public void setNome(String textInput) {
		nome = textInput;
	}
    
    public String getNascimento() {
  		return nascimento;
  	}
      
    public void setNascimento(String textInput) {
  		nascimento = textInput;
  	}
}