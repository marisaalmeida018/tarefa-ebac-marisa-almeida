import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nomes {

    public static void main(String[] args) {
        String nome = ("Amanda, Ivan, Juliana");
        String[] pessoa = nome.split(", ");
        for(String pessoas: pessoa){
            System.out.println(pessoas);
        }
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Juliana");
        pessoas.add("Amanda");
        pessoas.add("Ivan");
        Collections.sort(pessoas);
        System.out.println(pessoas);
    }
}
