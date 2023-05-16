import java.util.Scanner;
public class functionOfFactorial {
    public static int calculateFactorial(int a) {
        int Factorial = 1;
        if (a < 0) {
            System.out.println("Invalid choice");
            return Factorial;
        }
        else {
            for (int i = a; i >= 1;i--) {
            Factorial = Factorial * i;
            } 
        }
        return Factorial;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int F = calculateFactorial(a);
        System.out.println("Factorial is : "+F);
        sc.close();
    }
}
