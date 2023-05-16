import java.util.*;
public class D2arrayOfFindNum {
    public static void main(String[] args) {
        int num[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers : ");
        for (int i =0;i<3;i++) {
            for (int j =0;j<3;j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter num to find : ");
        int x = sc.nextInt();
        for (int i =0;i<3;i++) {
            for (int j =0;j<3;j++) {
                if (num[i][j] == x) {
                    System.out.println("Your numbers is found at index : "  +i+","+j);
                }
            }
        }
        sc.close();

    }
}
