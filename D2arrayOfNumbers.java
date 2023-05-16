import java.util.*;
public class D2arrayOfNumbers {
    public static void main(String[] args) {
        int num[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers : ");
        for (int i =0;i<3;i++) {
            for (int j =0;j<3;j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your numbers are : ");
        for (int i =0;i<3;i++) {
            for (int j =0;j<3;j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
