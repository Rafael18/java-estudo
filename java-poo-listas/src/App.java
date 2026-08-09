import edu.dominio.Bootcamp;
import edu.dominio.Curso;
import edu.dominio.Dev;
import edu.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(java.time.LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos Vitor:" + devVitor.getConteudosConcluidos());
        System.out.println("XP:" + devVitor.calcularTotalXp());

    }
}
