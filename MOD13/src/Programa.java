public class Programa {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Luíz");
        pf.setCadastro(1234567890L);
        pf.setSexo("M");
        pf.setIdade(20L);
        pf.setOcupacao("Empresário");
        imprimir(pf);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa do Luiz");
        pj.setCadastro(86746395441L);
        pj.setQtdefuncionarios(10L);
        imprimir(pj);

    }
    // METODO PARA PADRONIZAR AS IMPRESSOES
    public static void imprimir (Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome() + "      CPF/CNPJ: " + pessoa.getCadastro());
    }
}
