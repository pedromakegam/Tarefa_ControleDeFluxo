import java.util.Scanner;

/**
 * @author pedrovanderlansantana
 * receber a nota de 4 alunos, dividir por 4 se for maior ou igual a 7 = aprovado, se maior ou igual a 5 de recuperacao se nao reprovado
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota da primeira unidade: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota da segunda unidade: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota da terceira unidade: ");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite a nota da quarta unidade: ");
        double nota4 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;


        if (media >= 7) {
            System.out.println("Sua média foi: " + media + " - Aprovado!");
        } else if (media >= 5) {
            System.out.println("Sua média foi: " + media + " - Recuperação!");
        } else {
            System.out.println("Sua média foi: " + media + " - Reprovado!");
        }

    }

}

