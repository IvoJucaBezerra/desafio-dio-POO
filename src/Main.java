import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIvo = new Dev();
        devIvo.setNome("Ivo Jucá");
        devIvo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ivo Jucá:" + devIvo.getConteudosInscritos());
        devIvo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ivo Jucá:" + devIvo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ivo Jucá:" + devIvo.getconteudosConcluidos());
        System.out.println("XP:" + devIvo.calcularTotalXp());

        System.out.println("------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria Mari");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria Mari:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria Mari:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Maria Mari:" + devMaria.getconteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());










    }
}