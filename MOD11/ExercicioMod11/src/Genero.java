import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Genero {
    public static void main(String[] args) {

        String nomes = ("Amanda - F, Ivan - M, Juliana - F");
        String[] pessoa = nomes.split(", ");

        Map<String, List<String>> grupos = new HashMap<>();
        for (String parte : pessoa) {
            parte = parte.trim();
            String[] nomeGenero = parte.split("-");
            String nome =  nomeGenero[0];
            String genero = nomeGenero[1];
            grupos.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);

        }
        for (Map.Entry<String, List<String>> entry : grupos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    

}
