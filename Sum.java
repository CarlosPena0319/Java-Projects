import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Integer: ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + Integer.sum(a, b));

    }
}
