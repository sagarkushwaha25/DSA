import java.util.Scanner;
public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
