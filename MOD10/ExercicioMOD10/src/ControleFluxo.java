/**
 * Criar a média de 4 notas e colocar condições
 */

public class ControleFluxo {
    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 7;
        int nota3 = 8;
        int nota4 = 4;
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        if(media <= 5){
            System.out.println("Reprovado");
        }else if (media > 5 && media <= 7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }


    }
}