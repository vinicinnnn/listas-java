import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma opção (entre 5 e 9): ");
        int opcao = scanner.nextInt();

        if (opcao >= 5 && opcao <= 9) {
            System.out.println("Opção escolhida: " + opcao);
        } else {
            System.out.println("Opção inválida. Por favor, escolha um número entre 5 e 9.");
        }
    }
}
