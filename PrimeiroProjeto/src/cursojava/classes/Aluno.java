package cursojava.classes;

public class Aluno {

	/*Esses são os atributos do Aluno*/
	
	private String nome;
	private int idade;
	private dataNascimento;
	private registroGeral;
	private numeroCpf;
	private nomeMae;
	private nomePai;
	private dataMatricula;
	private nomeEscola;
	private serieMatriculado;

	public Aluno() { /*Cria os dados na memória, sendo padrão do java*/
		
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*Veremos os metodos SETTERS e GETTERS do objeto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/ 
	
	/*Recebe dados*/
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return nome;
	}
	
}
