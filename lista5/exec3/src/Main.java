import java.util.Scanner;

public class Main {
    public static int calcularPotencia(int X, int Y) {
        if (Y < 0) {
            throw new IllegalArgumentException("Y deve ser um número inteiro não negativo");
        }

        int potencia = 1;
        for (int i = 0; i < Y; i++) {
            potencia *= X;
        }
        return potencia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base X da potência (um número inteiro): ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente Y da potência (um número inteiro não negativo): ");
        int expoente = scanner.nextInt();

        try {
            int resultado = calcularPotencia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
