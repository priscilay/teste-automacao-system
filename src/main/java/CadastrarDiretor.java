//	import java.util.List;
//	import java.util.Scanner;
//	import java.util.ArrayList;
//
//	public class CadastrarDiretor {
//
//		private Scanner l;
//		private boolean execute;
//		private List<Filme> filme;
//
//
//		private CadastrarDiretor() {
//			l = new Scanner(System.in);
//			execute = true;
//			filme = new ArrayList<Filme>();
//
//			System.out.println("BEM VINDO AO CADASTRO DE DIRETORES");
//			
//			Filme nomeFilme = new Filme();
//			nomeFilme.setNome(textInput("Teste"));
//		}
//	}
//
////			while (execute) {
////				String opcao = menu();
////
////				if (opcao.equalsIgnoreCase("n")) {
////					//cadastrarDiretor();
////				} else if (opcao.equalsIgnoreCase("l")) {
////					listarCadastros();
////				} else if (opcao.equalsIgnoreCase("x")) {
////					execute = false;
////				} else {
////					System.out.println("\nOpção Inválida !!! \n");
////				}
////			}
////		}
////		
//		private String menu() {
//			System.out.println("Selecione a opção:");
//			System.out.println("N - Novo cadastro");
//			System.out.println("L - Listar cadastros");
//			System.out.println("X - Sair");
//			return l.nextLine();
//		}
//
//		
////
////		private void cadastrarDiretor() {
////			boolean cadastrando = true;
////
////			while (cadastrando) {
////				System.out.println("Cadastro de Usuário");
////				Diretor d = new Diretor();
////				d.setNome(textInput());
////				d.setNascimento(textInput());
////			
////				
////
////				String cadastrar = textInput("Adicionar cadastro (S/N) ?");
////				if (cadastrar.equalsIgnoreCase("s")) {
////					System.out.println("Cadastro adicionado !!!");
////					filme.add(d);
////				} else if (cadastrar.equalsIgnoreCase("n")){
////					System.out.println("Cadastro ignorado !!!");
////				} else {
////					System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
////				}
////
////				String continua = textInput("Continuar cadastrando (S/N) ?");
////				if (continua.equalsIgnoreCase("N")) {
////					cadastrando = false;
////				} else if (continua.equalsIgnoreCase("s")){
////					// se for s sai do if e volta para o inicio do while
////				} else {
////					System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
////					cadastrando = false;
////				}
////			}
////		}
////
////		private void listarCadastros() {
////			if (filme.size() == 0) {
////				System.out.println("\nNão existem cadastros !!!\n");
////			} else {
////				System.out.println("\nLista de Cadastros\n");
////				for (int i = 0; i < filme.size(); i++) {
////					Filme d = filme.get(i);
////					System.out.println("Cadastro número: " + i);
////					System.out.println("\tNome: " + d.getNome());
////				}
////				System.out.println("\nFim da lista\n");
////			}
////		}
//////
////		private String textInput() {
////			System.out.println(label);
////			return l.nextLine();
////		}
//
//	
//
//
