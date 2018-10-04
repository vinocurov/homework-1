public class Problem2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("s0 = ");
        double s0 = scanner.nextDouble();

        System.out.print("v0 = ");
        double v0 = scanner.nextDouble();

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("t = ");
        double t = scanner.nextDouble();

        scanner.close();

        double s = s0 + v0 * t + 0.5 * a * t * t;
        System.out.println("s = " + s);
    }
}
