import java.time.LocalDate;

import dominio.Curso;
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
		
	}	
	
}
