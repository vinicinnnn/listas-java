//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Digite o valor do raio:");
        n1 = scanner.nextDouble();
        System.out.println("Digite a altura do cilindro");
        n2 = scanner.nextDouble();

        double n3 = 3.14159 * (n1*n1) * n2;
        System.out.println(n3);

    }
}