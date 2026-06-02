import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double circumference = 2 * 3.14 * r;

        System.out.println(circumference);
    }
}