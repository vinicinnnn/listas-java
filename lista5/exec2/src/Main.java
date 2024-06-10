import java.util.Scanner;

public class Main {
    public static int calcularFatorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("N deve ser um número inteiro não negativo");
        }

        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        try {
            int resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
