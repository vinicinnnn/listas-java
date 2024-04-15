import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        double a = input.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        double b = input.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A raiz da equação é: x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

        input.close();
    }
}
