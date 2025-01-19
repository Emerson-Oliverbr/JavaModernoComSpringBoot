public class Main {
    public static void main(String[] args) {
        
        int nota1 = 8;
        int nota2 = 6;
        int frequencia = 80;

        
        double media = (nota1 + nota2) / 2.0;

        
        if (media >= 7 && frequencia >= 75) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
