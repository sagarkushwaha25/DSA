import java.util.Scanner;
public class swap {
    swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I value = ");
        int c1 = sc.nextInt();
        System.out.println("Enter II value = ");
        int c2 = sc.nextInt();

        System.out.println("Value of container 1 = "+c1);
        System.out.println("Value of container 2 = "+c2);

        int temp = c1;
        c1 = c2;
        c2 = temp;
        
        System.out.println("----after swapping----");
        
        System.out.println("Value of container 1 = "+c1);
        System.out.println("Value of container 2 = "+c2);
        sc.close();
    }
    public static void main(String[] args) {
        

    }
}
