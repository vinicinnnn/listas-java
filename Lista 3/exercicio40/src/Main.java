import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int n,f;
        f=1;

        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        for(int i=n;i>1;i--)
            f = f*i;

        System.out.println(n+"!= "+f);
    }
}