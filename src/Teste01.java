import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno(556695, "Gayse Molestado", "SI"));
        lista.add(new Aluno(556736, "Enzo Bilola", "SI"));
        lista.add(new Aluno(556161, "Lucas Picudao", "SI"));
        lista.add(new Aluno(557645, "Julia Narizin", "SI"));
        lista.add(new Aluno(556683, "Rebeca Danadinha", "SI"));

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getCurso));
        System.out.println();
        lista.forEach(aluno -> System.out.println(aluno));
    }
}
