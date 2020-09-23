package cursojava.executavel;

import cursojava.classes.Aluno;

public class oneclass {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referencia para o objeto Aluno*/
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Ferraretto";
		aluno1.idade = 65;
		System.out.println("Nome do aluno 1 é = " + aluno1.nome);
		System.out.println("A idade é = " + aluno1.idade);
		
		Aluno aluno2 = new Aluno();
	
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		Aluno aluno6 = new Aluno("João", 26);
		
	}
}
