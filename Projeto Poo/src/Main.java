import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentorias;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundão!");
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso Python");
        curso1.setDescricao("descrição curso Python");
        curso1.setCargaHoraria(10);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descrição curso Java");
        curso2.setCargaHoraria(16);

        Mentorias mentoria1 = new Mentorias("mentorias", "descricao da mentoria");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Descrição do bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Devs devMatheus = new Devs("Matheus");
        devMatheus.inscrever(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        System.out.println("-----------------------");

        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();

        System.out.println("Conteúdos Inscritos: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());        
    }
}
