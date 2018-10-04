public class CelciusToFahrenheit {

    public static void main(String[] args) {
        System.out.print("Enter the temperature in degrees Celcius: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double tC = scanner.nextDouble();
        scanner.close();

        double fahrenheit = 1.8 * tC + 32;

        System.out.println(tC + " degrees Celcius is equal to " + fahrenheit +  " degrees Fahrenheit");
    }
}
