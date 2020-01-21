package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ivo", 29);
		Aluno aluno2 = new Aluno("Kassia", 25);
		Aluno aluno3 = new Aluno("Henry", 3);
		Aluno aluno4 = new Aluno("Joao", 59);
		Aluno aluno5 = new Aluno("Neide", 58);
		
		List<Aluno> alunos = new ArrayList<>();
		alunos.addAll(Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5));
		
		Turma turma = new Turma("turma lopes", alunos);
		
		// exemplo com map fazendo soma
		Integer somaIdade = turma.getAlunos().stream()
				.map(a -> a)
				.mapToInt(a -> a.getIdade())
				.sum();		
		
		System.out.println("Soma da Idades é: " + somaIdade);
		
		// exemplo com map pegando media
		OptionalDouble media = turma.getAlunos().stream()
						.map(a -> a)
						.mapToInt(a -> a.getIdade())
						.average();	
				
				System.out.println("media das Idades é: " + media.getAsDouble());
		
		// exemplo com filter
		Integer somaIdade2 = turma.getAlunos().stream()
				.filter(a -> a.getNome().length() > 3)
				.mapToInt(a -> a.getIdade())
				.sum();

		
		System.out.println("Soma da Idades é: " + somaIdade2);
		
		
		// exemplo com map
		Set<String> nomes = turma.getAlunos().stream()
				.map(al -> al.getNome())
				.collect(Collectors.toSet());
		
		// exemplo com foreach
		/**
		 * o Set não mantém a ordem pois ele não 
		 * guarda o indice 
		 */
		nomes.stream().forEach(nome -> {
			System.out.println(nome);
		});
		
		// unindo os dois acima
		/**
		 * É importante observar que o List mantem
		 * a ordem dos objetos 
		 */
//		turma.getAlunos().stream()
//				.map(al -> al.getNome())
//				.filter(nome -> nome.length() > 3)
//				.forEach(System.out::println);

		
	}

}

class Turma {
	
	private String nomeTurma;
	private List<Aluno> alunos = new ArrayList<>();
	
	public Turma() {}
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public Turma(String nomeTurma, List<Aluno> alunos) {
		this.nomeTurma = nomeTurma;
		this.alunos = alunos;
	}
	
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public String getNomeTurma() {
		return this.nomeTurma;
	}
	
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public List<Aluno> getAlunos(){
		return this.alunos;
	}
	
	
	
}

class Aluno {
	
	private String nome;
	private Integer idade;
	
	public Aluno() {}
	
	public Aluno(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
}
