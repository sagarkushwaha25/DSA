import java.util.*;
public class arrayOfFindNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        System.out.print("Enter marks : ");
        for (int i = 0;i<10;i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Enter your num to find : ");
        int x = sc.nextInt();
        for(int i = 0;i<10;i++) {
            if (marks[i] == x)
                System.out.println("Your num is found at index " + i);
        }
        sc.close();
        
    }
}
