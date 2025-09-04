import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno(556695, "Gabriel Jose", "SI"));
        lista.add(new Aluno(556736, "Enzo Cezar", "SI"));
        lista.add(new Aluno(556161, "Lucas Vendramini", "SI"));
        lista.add(new Aluno(557645, "Julia Mendes", "SI"));
        lista.add(new Aluno(556683, "Rebeca Berbert", "SI"));

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getCurso));
        System.out.println();
        lista.forEach(aluno -> System.out.println(aluno));
    }
}
