import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {

       Set<Aluno> lista = new HashSet<>();

        lista.add(new Aluno(556695, "Gayse Molestado", "SI"));
        lista.add(new Aluno(556736, "Enzo Bilola", "SI"));
        lista.add(new Aluno(556161, "Lucas Picudao", "SI"));
        lista.add(new Aluno(557645, "Julia Narizin", "SI"));
        lista.add(new Aluno(556683, "Rebeca Danadinha", "SI"));

        lista.forEach(aluno -> System.out.println(aluno));
    }
}
