import java.util.*;
public class DivBy3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of elements : ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter your num in Array : ");
        for (int i =0;i<ar.length;i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Numbers that are divisible by 3 & 5 but not divisible by both are ");
        for (int i =0;i<ar.length;i++) {
            if ((ar[i] % 3 ==0 || ar[i] % 5 ==0) && ar[i] % 15 != 0) {
                System.out.print(ar[i]+" ");
            }
        }
        sc.close();
    }
}

