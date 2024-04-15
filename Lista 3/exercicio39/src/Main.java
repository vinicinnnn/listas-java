public class Main {
    public static void main(String[] args) {
        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (9 / 5) * celsius + 32;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}