public class Problem4 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        System.out.print(f1 + " " + f2 + " ");

        for (int i = 3; i <= 12; ++i) {
            int f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.print(f + " ");
        }
    }
}
