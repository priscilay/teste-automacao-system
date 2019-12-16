import java.util.List;

public class Diretor
{
    public String nome;
    public String nascimento;
    public List<Filme> filmes;
    
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