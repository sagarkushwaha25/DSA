import java.util.Scanner;
public class functionOfMultiply {
    public static int calculateMultiply(int a, int b) {
        int Multiply = a * b;
        return Multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter I value: ");
        int a = sc.nextInt();
        System.out.print("Enter II value: ");
        int b = sc.nextInt();
        int Multiply = calculateMultiply(a, b);
        System.out.println("Multiply : "+Multiply);
        sc.close();
    }
}
