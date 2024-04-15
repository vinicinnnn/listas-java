import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("digite o segundo numero");
        int numero2 = scanner.nextInt();

        int maiorNumero = Math.max(numero1, numero2);
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O maior número é: " + maiorNumero);
        }

        scanner.close();

    }
}
