package cursojava.executavel;

import cursojava.classes.Aluno;

public class oneclass {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referencia para o objeto Aluno*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ferraretto Hotel");
		aluno1.setIdade(50);
		aluno1.setDataMatricula("24/09/2019");
		aluno1.setSerieMatriculado("8 serie");
		aluno1.setDataNascimento("29/04/1984");
		aluno1.setNomeEscola("JavaFULLstack - JAVA EE WEB");
		aluno1.setNomePai("Antonio da Cunha");
		aluno1.setNomeMae("Idalina da Cunha");
		aluno1.setNumeroCpf("999.999.999-99");
		aluno1.setRegistroGeral("99.999.999.9");
		
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(82.7);
		aluno1.setNota4(95.3);
		
		System.out.println("O nome do aluno é: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Matricula: " + aluno1.getDataMatricula());
		System.out.println("Serie: " + aluno1.getSerieMatriculado());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Escola: " + aluno1.getNomeEscola());
		System.out.println("Nome do pai: " + aluno1.getNomePai());
		System.out.println("Nome da Mãe: "+ aluno1.getNomeMae());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("RG: " + aluno1.getRegistroGeral());
		
		//System.out.println("Nota1: " + aluno1.getNota1());
		//System.out.println("Nota2: " + aluno1.getNota2());
		//System.out.println("Nota3: " + aluno1.getNota3());
		//System.out.println("Nota4: " + aluno1.getNota4());
		
		System.out.println("Média das notas: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
		Aluno aluno2 = new Aluno("Teste1");
	
		Aluno aluno3 = new Aluno("Teste2");
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		Aluno aluno6 = new Aluno("João", 26);
		
	}
}
