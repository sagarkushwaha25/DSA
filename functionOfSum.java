import java.util.Scanner;
public class functionOfSum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter I value: ");
        int a = sc.nextInt();
        System.out.print("Enter II value: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
