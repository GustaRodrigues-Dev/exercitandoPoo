import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;


public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setCargaHoraria(8);
		
			curso1.setDescricao("descrição sobre o curso de Python");
			
			curso1.setTitulo("Curso de python");
			
		Curso curso2 = new Curso();
		
			curso2.setCargaHoraria(4);
			
			curso2.setDescricao("descrição sobre o curso de Ruby");
			
			curso2.setTitulo("Curso de Ruby");
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		
			mentoria.setData(LocalDate.now());
			
			mentoria.setDescricao("Mentoria inédita");
			
			mentoria.setTitulo("Não perca!");
		
			
			Bootcamp bootcamp = new Bootcamp();
				bootcamp.setNome("Aprendendo Poo Java");
				bootcamp.setDescricao("Excelente bootcamp para praticar.");
				bootcamp.getConteudos().add(curso1);
				bootcamp.getConteudos().add(curso2);
				bootcamp.getConteudos().add(mentoria);
			
			Dev devLuiz = new Dev();
				devLuiz.setNome("Luiz");
				devLuiz.inscreverBootcamp(bootcamp);
			
				devLuiz.progredir();
			
			System.out.println("Conteúdos inscritos" + devLuiz.getConteudosInscritos());
			System.out.println("Conteúdos concluidos" + devLuiz.getConteudosConcluidos());
			System.out.println("XP" + devLuiz.calcularTotalXp());
	}	
	
}
