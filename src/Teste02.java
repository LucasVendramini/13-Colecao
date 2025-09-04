import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {

       Set<Aluno> lista = new HashSet<>();

        lista.add(new Aluno(556695, "Gabriel Jose", "SI"));
        lista.add(new Aluno(556736, "Enzo Cezar", "SI"));
        lista.add(new Aluno(556161, "Lucas Vendramini", "SI"));
        lista.add(new Aluno(557645, "Julia Mendes", "SI"));
        lista.add(new Aluno(556683, "Rebeca Berbert", "SI"));

        lista.forEach(aluno -> System.out.println(aluno));
    }
}
