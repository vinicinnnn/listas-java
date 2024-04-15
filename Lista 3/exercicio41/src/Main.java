import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int n1,n2;
        System.out.println("Digite um numero: ");
        n1 = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        n2 = scanner.nextInt();

        if(n1>n2){
            int aux = n1;
            n1=n2;
            n2=aux;
        }

        for(int i=n1+1;i<n2;i++)
            System.out.println(i);

    }
}