//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1;


        System.out.println("digite o numero em graus celsius:");
        n1 = scanner.nextDouble();

        double n2 =  (n1 * 9/5) + 32;
        System.out.println(n2);

    }
}