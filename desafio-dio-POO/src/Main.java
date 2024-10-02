import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de java");
		mentoria1.setDescricao("mentoria java");
		mentoria1.setData(LocalDate.now());
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInstritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudos Inscritos" + devCamila.getConteudosInstritos());
		System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("----------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInstritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosInstritos());
		System.out.println("Conteudos Inscritos" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
	}
		
}
