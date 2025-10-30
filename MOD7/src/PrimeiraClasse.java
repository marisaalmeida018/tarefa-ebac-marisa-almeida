/**
 * @author m.almeida
 */
public class PrimeiraClasse {

    public static void main(String[] args){
        Filme filme = new Filme();
        filme.setNome("Titanic");
        System.out.println(filme.getNome());

        filme.setGenero("Romance");
        System.out.println(filme.getGenero());

        filme.setDiretor("James Cameron");
        System.out.println(filme.getDiretor());

        filme.setNacionalidade("EUA");
        System.out.println(filme.getNacionalidade());

        filme.setAnoLancamento(1997);
        System.out.println(filme.getAnoLancamento());

    }
}